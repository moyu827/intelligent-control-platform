package com.axy.intelligentcontrolplatform.experiment.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSybw;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSybwService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 试验部位 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/experiment/position")
public class TZhZtjxSybwController {

    @Autowired
    ITZhZtjxSybwService itZhZtjxSybwService;

    @GetMapping("GET/position")
    public MessageBean getExperimentPosition(TZhZtjxSybw tZhZtjxSybw){
        return itZhZtjxSybwService.getExperimentPosition(tZhZtjxSybw);
    }
    @PostMapping("POST/position")
    public MessageBean postExperimentPosition(TZhZtjxSybw tZhZtjxSybw){
        return itZhZtjxSybwService.postExperimentPosition(tZhZtjxSybw);
    }
    @PutMapping("PUT/position")
    public MessageBean putExperimentPosition(TZhZtjxSybw tZhZtjxSybw){
        return itZhZtjxSybwService.postExperimentPosition(tZhZtjxSybw);
    }

    @DeleteMapping("DELETE/position")
    public MessageBean deleteExperimentPosition(String objId){
        return itZhZtjxSybwService.deleteExperimentPosition(objId);
    }

}
