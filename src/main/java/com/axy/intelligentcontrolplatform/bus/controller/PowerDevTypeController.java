package com.axy.intelligentcontrolplatform.bus.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevType;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevTypeParam;
import com.axy.intelligentcontrolplatform.bus.service.IPowerDevTypeService;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 电力设备类型表 前端控制器
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@RestController
@RequestMapping("/bus/power-dev-type")
public class PowerDevTypeController {
    private IPowerDevTypeService powerDevTypeService;
    private PowerDevTypeController(IPowerDevTypeService powerDevTypeService){
        this.powerDevTypeService = powerDevTypeService;
    }

    @PostMapping("POST/powerDevType")
    public MessageBean addPowerDevType(String name){
        return powerDevTypeService.addPowerDevType(name);
    }

    @DeleteMapping("DELETE/powerDevType")
    public MessageBean deletePowerDevType(Long id){
        return powerDevTypeService.deletePowerDevType(id);
    }

    @PutMapping("PUT/powerDevType")
    public MessageBean putPowerDevType(PowerDevType powerDevType){
        return powerDevTypeService.putPowerDevType(powerDevType);
    }

    @GetMapping("GET/powerDevTypes")
    public MessageBean getPowerDevTypes(PowerDevTypeParam powerDevTypeParam){
        return powerDevTypeService.getPowerDevTypes(powerDevTypeParam);
    }

}
