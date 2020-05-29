package com.axy.intelligentcontrolplatform.arcsoft.service.impl;

import com.arcsoft.face.*;
import com.arcsoft.face.enums.DetectMode;
import com.arcsoft.face.enums.DetectOrient;
import com.arcsoft.face.toolkit.ImageFactory;
import com.arcsoft.face.toolkit.ImageInfo;
import com.axy.intelligentcontrolplatform.arcsoft.enums.ErrorCodeEnum;
import com.axy.intelligentcontrolplatform.arcsoft.factory.FaceEngineFactory;
import com.axy.intelligentcontrolplatform.arcsoft.rpc.BusinessException;
import com.axy.intelligentcontrolplatform.arcsoft.service.FaceEngineService;
import com.axy.intelligentcontrolplatform.arcsoft.util.Base64Util;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


@Service
@Slf4j
public class FaceEngineServiceImpl implements FaceEngineService {


    @Value("${arcsoft.dll-dir}")
    public String sdkLibPath;
    @Value("${arcsoft.appid}")
    public String appId;
    @Value("${arcsoft.appkey}")
    public String sdkKey;

    //通用人脸识别引擎池
    private GenericObjectPool<FaceEngine> faceEngineGeneralPool;


    @PostConstruct
    public void init() {
        GenericObjectPoolConfig detectPoolConfig = new GenericObjectPoolConfig();
        detectPoolConfig.setMaxIdle(5);
        detectPoolConfig.setMaxTotal(5);
        detectPoolConfig.setMinIdle(5);
        detectPoolConfig.setLifo(false);
        EngineConfiguration detectCfg = new EngineConfiguration();
        FunctionConfiguration detectFunctionCfg = new FunctionConfiguration();
        detectFunctionCfg.setSupportFaceDetect(true);//开启人脸检测功能
        detectFunctionCfg.setSupportFaceRecognition(true);//开启人脸识别功能
        detectFunctionCfg.setSupportAge(true);//开启年龄检测功能
        detectFunctionCfg.setSupportGender(true);//开启性别检测功能
        detectFunctionCfg.setSupportLiveness(true);//开启活体检测功能
        detectCfg.setFunctionConfiguration(detectFunctionCfg);
        detectCfg.setDetectMode(DetectMode.ASF_DETECT_MODE_IMAGE);//图片检测模式，如果是连续帧的视频流图片，那么改成VIDEO模式
        detectCfg.setDetectFaceOrientPriority(DetectOrient.ASF_OP_0_ONLY);//人脸旋转角度
        faceEngineGeneralPool = new GenericObjectPool(new FaceEngineFactory(sdkLibPath, appId, sdkKey, null, detectCfg), detectPoolConfig);//底层库算法对象池
    }

    @Override
    public List<FaceInfo> detectFaces(ImageInfo imageInfo) {

        FaceEngine faceEngine = null;
        try {
            faceEngine = faceEngineGeneralPool.borrowObject();
            if (faceEngine == null) {
                throw new BusinessException(ErrorCodeEnum.FAIL, "获取引擎失败");
            }

            //人脸检测得到人脸列表
            List<FaceInfo> faceInfoList = new ArrayList<FaceInfo>();
            //人脸检测
            int errorCode = faceEngine.detectFaces(imageInfo.getImageData(), imageInfo.getWidth(), imageInfo.getHeight(), imageInfo.getImageFormat(), faceInfoList);
            if (errorCode == 0) {
                return faceInfoList;
            } else {
                log.error("人脸检测失败，errorCode：" + errorCode);
            }

        } catch (Exception e) {
            log.error("", e);
        } finally {
            if (faceEngine != null) {
                //释放引擎对象
                faceEngineGeneralPool.returnObject(faceEngine);
            }
        }

        return null;

    }
    @Override
    public byte[] extractFaceFeature(ImageInfo imageInfo, FaceInfo faceInfo) {

        FaceEngine faceEngine = null;
        try {
            faceEngine = faceEngineGeneralPool.borrowObject();
            if (faceEngine == null) {
                throw new BusinessException(ErrorCodeEnum.FAIL, "获取引擎失败");
            }

            FaceFeature faceFeature = new FaceFeature();
            //提取人脸特征
            int errorCode = faceEngine.extractFaceFeature(imageInfo.getImageData(), imageInfo.getWidth(), imageInfo.getHeight(), imageInfo.getImageFormat(), faceInfo, faceFeature);
            if (errorCode == 0) {
                return faceFeature.getFeatureData();
            } else {
                log.error("特征提取失败，errorCode：" + errorCode);
            }

        } catch (Exception e) {
            log.error("", e);
        } finally {
            if (faceEngine != null) {
                //释放引擎对象
                faceEngineGeneralPool.returnObject(faceEngine);
            }
        }

        return null;

    }

    @Override
    public int faceCompare(byte[] targetFeature){
        FaceEngine faceEngine =null;
        String string = getImage();
        byte[] bytes = Base64Util.base64ToBytes(string);
        ImageInfo rgbData = ImageFactory.getRGBData(bytes);
        List<FaceInfo> faceInfoList = detectFaces(rgbData);
        byte[] sourceFeature = extractFaceFeature(rgbData, faceInfoList.get(0));
        try {
            faceEngine = faceEngineGeneralPool.borrowObject();
            if (faceEngine == null) {
                throw new BusinessException(ErrorCodeEnum.FAIL, "获取引擎失败");
            }
            FaceFeature faceFeature1 = new FaceFeature();
            faceFeature1.setFeatureData(sourceFeature);
            FaceFeature faceFeature2 = new FaceFeature();
            faceFeature2.setFeatureData(targetFeature);
            //提取人脸特征
            FaceSimilar faceSimilar = new FaceSimilar();
            int errorCode = faceEngine.compareFaceFeature(faceFeature1, faceFeature2, faceSimilar);
            if (errorCode == 0) {
                if(faceSimilar.getScore()>0.8f){
                    return 1;
                }
            } else {
                log.error("特征提取失败，errorCode：" + errorCode);
                return 0;
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (faceEngine != null) {
                //释放引擎对象
                faceEngineGeneralPool.returnObject(faceEngine);
            }
        }
        return 2;
//        try{
//             faceEngine = faceEngineComparePool.borrowObject();
//            FaceFeature targetFaceFeature = new FaceFeature();
//            targetFaceFeature.setFeatureData(targetFeature);
//            FaceFeature sourceFaceFeature = new FaceFeature();
//            sourceFaceFeature.setFeatureData(sourceFeature);
//            FaceSimilar faceSimilar = new FaceSimilar();
//            faceEngine.compareFaceFeature(targetFaceFeature, sourceFaceFeature, faceSimilar);
//            if (faceSimilar.getScore() > 0.8f) {//相似值大于配置预期，加入到识别到人脸的列表
//                return 1;
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            if (faceEngine != null) {
//                faceEngineComparePool.returnObject(faceEngine);
//            }
//        }
//        return 0;
    }

    public static String getImage() {
        FileInputStream io =null;
        try {
            io = new FileInputStream("E:\\image\\Image2-2.jpg");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(io);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] buf = new byte[1024*1024];
            int length = -1;
            while ((length = bufferedInputStream.read(buf)) != -1) {
                byteArrayOutputStream.write(buf, 0, length);
            }
            byte[] src = byteArrayOutputStream.toByteArray();
            return Base64.getMimeEncoder().encodeToString(src);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(io!=null){
                try {
                    io.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
