package com.axy.intelligentcontrolplatform.bus.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevModel;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevModelParam;
import com.axy.intelligentcontrolplatform.bus.service.IPowerDevModelService;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 电力设备型号表 前端控制器
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@RestController
@RequestMapping("/bus/power-dev-model")
public class PowerDevModelController {
    private IPowerDevModelService powerDevModelService;
    private PowerDevModelController(IPowerDevModelService powerDevModelService){
        this.powerDevModelService = powerDevModelService;
    }

    @PostMapping("POST/powerDevModel")
    public MessageBean addPowerDevModel(PowerDevModel powerDevModel){
        return powerDevModelService.addPowerDevModel(powerDevModel);
    }

    @DeleteMapping("DELETE/powerDevModel")
    public MessageBean deletePowerDevModel(Long id){
        return powerDevModelService.deletePowerDevModel(id);
    }

    @PutMapping("PUT/powerDevModel")
    public MessageBean putPowerDevModel(PowerDevModel powerDevModel){
        return powerDevModelService.putPowerDevModel(powerDevModel);
    }

    @GetMapping("GET/powerDevModels")
    public MessageBean getPowerDevModels(PowerDevModelParam powerDevModelParam){
        return powerDevModelService.getPowerDevModels(powerDevModelParam);
    }
}
