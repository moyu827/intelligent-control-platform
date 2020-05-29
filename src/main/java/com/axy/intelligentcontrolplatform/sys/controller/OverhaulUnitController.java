package com.axy.intelligentcontrolplatform.sys.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.sys.entity.OverhaulUnit;
import com.axy.intelligentcontrolplatform.sys.requestParam.OverHaulUnitParam;
import com.axy.intelligentcontrolplatform.sys.service.IOverhaulUnitService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yct
 * @since 2020-04-30
 */
@RestController
@RequestMapping("/sys/overhaul-unit")
public class OverhaulUnitController {
    private IOverhaulUnitService overhaulUnitService;
    private OverhaulUnitController(IOverhaulUnitService overhaulUnitService){
        this.overhaulUnitService = overhaulUnitService;
    }

    @PostMapping("POST/overhaulUnit")
    public MessageBean addOverHaulUnit(String name){
        return overhaulUnitService.addOverHaulUnit(name);
    }

    @DeleteMapping("DELETE/overhaulUnit")
    public MessageBean deleteOverHaulUnit(Long id){
        return overhaulUnitService.deleteOverHaulUnit(id);
    }

    @PutMapping("PUT/overhaulUnit")
    public MessageBean putOverHaulUnit(OverhaulUnit overhaulUnit){
        return overhaulUnitService.putOverHaulUnit(overhaulUnit);
    }

    @GetMapping("GET/overhaulUnits")
    public MessageBean getOverHaulUnits(OverHaulUnitParam overHaulUnitParam){
        return overhaulUnitService.getOverHaulUnits(overHaulUnitParam);
    }

}
