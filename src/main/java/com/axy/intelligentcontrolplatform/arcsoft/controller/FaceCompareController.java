package com.axy.intelligentcontrolplatform.arcsoft.controller;

import com.axy.intelligentcontrolplatform.arcsoft.service.FaceEngineService;
import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FaceCompareController：
 *
 * @author: li wenqiang
 * @date: 2020/5/27 18:24
 */
@RestController
@RequestMapping("/face-compare")
public class FaceCompareController {

    @Autowired
    private FaceEngineService faceEngineService;

    @GetMapping("GET/compareFace")
    private MessageBean compareFace(byte[] targetFeature){
        MessageBean messageBean = new MessageBean();
        int code = faceEngineService.faceCompare(targetFeature);
        messageBean.setStatus(String.valueOf(code));
        return messageBean;
    }
}
