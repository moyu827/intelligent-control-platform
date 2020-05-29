package com.axy.intelligentcontrolplatform.bus.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.SubControlArea;
import com.axy.intelligentcontrolplatform.bus.requestParam.SubControlAreaParam;
import com.axy.intelligentcontrolplatform.bus.service.ISubControlAreaService;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 子控区表 前端控制器
 * </p>
 *
 * @author yct
 * @since 2020-05-12
 */
@RestController
@RequestMapping("/bus/sub-control-area")
public class SubControlAreaController {
    private ISubControlAreaService subControlAreaService;
    private SubControlAreaController(ISubControlAreaService subControlAreaService){
        this.subControlAreaService =subControlAreaService;
    }

    @PostMapping("POST/subControlArea")
    public MessageBean addSubControlArea(SubControlArea subControlArea){
        return subControlAreaService.addSubControlArea(subControlArea);
    }

    @DeleteMapping("DELETE/subControlArea")
    public MessageBean deleteSubControlArea(Long id){
        return subControlAreaService.deleteSubControlArea(id);
    }

    @PutMapping("PUT/subControlArea")
    public MessageBean putSubControlArea(SubControlArea subControlArea){
        return subControlAreaService.putSubControlArea(subControlArea);
    }

    @GetMapping("GET/subControlAreas")
    public MessageBean getSubControlAreas(SubControlAreaParam subControlAreaParam){
        return subControlAreaService.getSubControlAreas(subControlAreaParam);
    }

}
