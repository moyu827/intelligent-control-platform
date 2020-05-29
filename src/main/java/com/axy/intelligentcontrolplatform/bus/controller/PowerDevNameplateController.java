package com.axy.intelligentcontrolplatform.bus.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevNameplate;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevNameplateParam;
import com.axy.intelligentcontrolplatform.bus.service.IPowerDevNameplateService;
import com.axy.intelligentcontrolplatform.bus.service.impl.PowerDevNameplateServiceImpl;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 铭牌参数表 前端控制器
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@RestController
@RequestMapping("/bus/power-dev-nameplate")
public class PowerDevNameplateController {
    private IPowerDevNameplateService powerDevNameplateService;
    private PowerDevNameplateController(IPowerDevNameplateService powerDevNameplateService){
        this.powerDevNameplateService = powerDevNameplateService;
    }

    @PostMapping("POST/powerDevNameplate")
    public MessageBean addPowerDevNameplate(PowerDevNameplate powerDevNameplate){
        return powerDevNameplateService.addPowerDevNameplate(powerDevNameplate);
    }

    @DeleteMapping("DELETE/powerDevNameplate")
    public MessageBean deletePowerDevNameplate(Long id){
        return powerDevNameplateService.deletePowerDevNameplate(id);
    }

    @PutMapping("PUT/powerDevNameplate")
    public MessageBean putPowerDevNameplate(PowerDevNameplate powerDevNameplate){
        return powerDevNameplateService.putPowerDevNameplate(powerDevNameplate);
    }

    @GetMapping("GET/powerDevNameplates")
    public MessageBean getPowerDevNameplates(PowerDevNameplateParam powerDevNameplateParam){
        return powerDevNameplateService.getPowerDevNameplates(powerDevNameplateParam);
    }

}
