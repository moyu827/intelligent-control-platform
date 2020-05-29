package com.axy.intelligentcontrolplatform.experiment.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyxz;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSyxzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 试验性质 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/experiment/nature")
public class TZhZtjxSyxzController {

    @Autowired
    ITZhZtjxSyxzService itZhZtjxSyxzService;
    @GetMapping("GET/nature")
    public MessageBean getNature(TZhZtjxSyxz tZhZtjxSyxz){
        return itZhZtjxSyxzService.getNature(tZhZtjxSyxz);
    }
    @PostMapping("POST/nature")
    public MessageBean postNature(TZhZtjxSyxz tZhZtjxSyxz){
        return itZhZtjxSyxzService.postNature(tZhZtjxSyxz);
    }
    @PutMapping("PUT/nature")
    public MessageBean putNature(TZhZtjxSyxz tZhZtjxSyxz){
        return itZhZtjxSyxzService.postNature(tZhZtjxSyxz);
    }
    @DeleteMapping("DELETE/nature")
    public MessageBean deleteNature(String objId){
        return itZhZtjxSyxzService.deleteNature(objId);
    }

}
