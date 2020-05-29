package com.axy.intelligentcontrolplatform.experiment.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxm;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSyxmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 试验项目 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/experiment/project")
public class TZhZtjxSyxmController {

    @Autowired
    ITZhZtjxSyxmService itZhZtjxSyxmService;

    @GetMapping("GET/project")
    MessageBean getProject(TZhZtjxSyxm tZhZtjxSyxm){
        return itZhZtjxSyxmService.getExperimentProject(tZhZtjxSyxm);
    }
    @PostMapping("POST/project")
    MessageBean postProject(TZhZtjxSyxm tZhZtjxSyxm){
        return itZhZtjxSyxmService.postExperimentProject(tZhZtjxSyxm);
    }
    @PutMapping("PUT/project")
    MessageBean putProject(TZhZtjxSyxm tZhZtjxSyxm){
        return itZhZtjxSyxmService.postExperimentProject((tZhZtjxSyxm));
    }
    @DeleteMapping("DELETE/project")
    MessageBean deleteProject(String objId){
        return itZhZtjxSyxmService.deleteExperimentProject(objId);
    }

}
