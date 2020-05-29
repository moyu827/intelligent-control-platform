package com.axy.intelligentcontrolplatform.experiment.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSyzy;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSyzyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 试验专业 前端控制器
 * </p>
 *
 * @author moyu
 * @since 2020-05-25
 */
@RestController
@RequestMapping("/experiment/speciality")
public class TZhZtjxSyzyController {

    @Autowired
    ITZhZtjxSyzyService itZhZtjxSyzyService;
    @GetMapping("GET/speciality")
    public MessageBean getSpeciality(TZhZtjxSyzy tZhZtjxSyzy){
        return itZhZtjxSyzyService.getSpeciality(tZhZtjxSyzy);
    }
    @PostMapping("POST/speciality")
    public MessageBean postSpeciality(TZhZtjxSyzy tZhZtjxSyzy){
        return itZhZtjxSyzyService.postSpeciality(tZhZtjxSyzy);
    }
    @PutMapping("PUT/speciality")
    public MessageBean putSpeciality(TZhZtjxSyzy tZhZtjxSyzy){
        return  itZhZtjxSyzyService.postSpeciality(tZhZtjxSyzy);
    }
    @DeleteMapping("DELETE/speciality")
    public MessageBean deleteSpeciality(String objId){
        return itZhZtjxSyzyService.deleteSpeciality(objId);
    }

}
