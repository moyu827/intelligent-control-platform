package com.axy.intelligentcontrolplatform.experiment.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymb;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSymbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 试验模板 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/experiment/temp")
public class TZhZtjxSymbController {

    @Autowired
    ITZhZtjxSymbService itZhZtjxSymbService;
    @GetMapping("GET/temp")
    public MessageBean getExperimentTemp(TZhZtjxSymb tZhZtjxSymb){
        return itZhZtjxSymbService.getExperimentTemp(tZhZtjxSymb);
    }
    @PostMapping("POST/temp")
    public MessageBean postExperimentTemp(TZhZtjxSymb tZhZtjxSymb){
        return itZhZtjxSymbService.postExperimentTemp(tZhZtjxSymb);
    }
    @PutMapping("PUT/temp")
    public MessageBean putExperimentTemp(TZhZtjxSymb tZhZtjxSymb){
        return itZhZtjxSymbService.postExperimentTemp(tZhZtjxSymb);
    }
    @DeleteMapping("DELETE/temp")
    public MessageBean deleteExperimentTemp(String objId){
        return itZhZtjxSymbService.deleteExperimentTemp(objId);
    }
}
