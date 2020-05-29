package com.axy.intelligentcontrolplatform.experiment.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyzxm;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSyzxmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 试验子项目 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/experiment/subproject")
public class TZhZtjxSyzxmController {

    @Autowired
    ITZhZtjxSyzxmService itZhZtjxSyzxmService;
    @GetMapping("GET/subproject")
    public MessageBean getSubProject(TZhZtjxSyzxm tZhZtjxSyzxm){
        return itZhZtjxSyzxmService.getSubProject(tZhZtjxSyzxm);
    }
    @PostMapping("POST/subproject")
    public MessageBean postSubProject(TZhZtjxSyzxm tZhZtjxSyzxm){
        return itZhZtjxSyzxmService.postSubProject(tZhZtjxSyzxm);
    }

    @PutMapping("PUT/subproject")
    public MessageBean putSubProject(TZhZtjxSyzxm tZhZtjxSyzxm){
        return itZhZtjxSyzxmService.postSubProject(tZhZtjxSyzxm);
    }
    @DeleteMapping("DELETE/subproject")
    public MessageBean deleteSubProject(String objId){
        return itZhZtjxSyzxmService.deleteSubProject(objId);
    }
}
