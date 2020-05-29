package com.axy.intelligentcontrolplatform.experiment.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymbxb;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSymbxbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;

/**
 * <p>
 * 试验模板-相别 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/experiment/temp-items")
public class TZhZtjxSymbxbController {

    @Autowired
    ITZhZtjxSymbxbService itZhZtjxSymbxbService;

    @GetMapping("GET/tempItems")
    public MessageBean getTempItems(TZhZtjxSymbxb tZhZtjxSymbxb){
        return itZhZtjxSymbxbService.getTempItems(tZhZtjxSymbxb);
    }
    @PostMapping("POST/tempItems")
    public MessageBean postTempItems(TZhZtjxSymbxb tZhZtjxSymbxb){
        return itZhZtjxSymbxbService.postTempItems(tZhZtjxSymbxb);
    }
    @PutMapping("PUT/tempItems")
    public MessageBean putTempItems(TZhZtjxSymbxb tZhZtjxSymbxb){
        return itZhZtjxSymbxbService.postTempItems(tZhZtjxSymbxb);
    }

    @DeleteMapping("DELETE/tempItems")
    public MessageBean deleteTempItems(String objId){
        return itZhZtjxSymbxbService.deleteTempItems(objId);
    }

}
