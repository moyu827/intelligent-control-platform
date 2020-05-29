package com.axy.intelligentcontrolplatform.arcsoft.service;


import com.arcsoft.face.FaceInfo;
import com.arcsoft.face.toolkit.ImageInfo;

import java.util.List;

public interface FaceEngineService {

    /**
     * 人脸检测
     * @param imageInfo
     * @return
     */
    List<FaceInfo> detectFaces(ImageInfo imageInfo);

    /**
     * 提取人脸特征码
     * @param imageInfo
     * @param faceInfo
     * @return
     */
    byte[] extractFaceFeature(ImageInfo imageInfo,FaceInfo faceInfo);

    /**
     * 人脸比对
     * @param targetFeature
     * @return
     */
    int faceCompare(byte[] targetFeature);


}
