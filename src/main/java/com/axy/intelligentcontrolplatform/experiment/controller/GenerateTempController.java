package com.axy.intelligentcontrolplatform.experiment.controller;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSybw;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymbxb;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyzxm;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSybwService;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSymbxbService;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSyzxmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * GenerateTempController：
 *
 * @author: li wenqiang
 * @date: 2020/5/27 10:07
 */
@RestController
@RequestMapping("/generate-temp")
public class GenerateTempController {
    @Autowired
    private ITZhZtjxSyzxmService itZhZtjxSyzxmService;
    @Autowired
    private ITZhZtjxSymbxbService itZhZtjxSymbxbService;
    @Autowired
    private ITZhZtjxSybwService itZhZtjxSybwService;

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    /**
     * 根据项目ID获取模板所需元素
     * @param objId
     * @return
     */
    @GetMapping("GET/tempElements")
    public MessageBean getSubProcjetList(String objId){
        MessageBean bean = new MessageBean();
        Map<String,Object> map = new HashMap<>();
        //获取子项目集合
        List<TZhZtjxSyzxm> subProjectList = itZhZtjxSyzxmService.getSubProjectByProjectId(objId);
        //获取项别集合
        List<TZhZtjxSymbxb> list = itZhZtjxSymbxbService.getTempItemsById(objId);
        List list1 = new ArrayList();
        Map<String,Object> objectMap = new HashMap<>();
        for (TZhZtjxSymbxb tZhZtjxSymbxb : list) {
            //获取部位集合
            List<TZhZtjxSybw> positionList = itZhZtjxSybwService.getPositionById(objId,tZhZtjxSymbxb.getObjId());
            objectMap.put("positionList",positionList);
            objectMap.put("tempItems",tZhZtjxSymbxb);
            list1.add(objectMap);
        }
        map.put("subProjectList",subProjectList);
        map.put("tempItemsList",list1);
        bean.setRows(map);
        return bean;
    }
}
