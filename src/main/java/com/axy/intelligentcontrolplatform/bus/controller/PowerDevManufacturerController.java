package com.axy.intelligentcontrolplatform.bus.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.PowerDevManufacturer;
import com.axy.intelligentcontrolplatform.bus.requestParam.PowerDevManufacturerParam;
import com.axy.intelligentcontrolplatform.bus.service.IPowerDevManufacturerService;
import com.axy.intelligentcontrolplatform.bus.service.impl.PowerDevManufacturerServiceImpl;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 电力设备厂商表 前端控制器
 * </p>
 *
 * @author yct
 * @since 2020-05-07
 */
@RestController
@RequestMapping("/bus/power-dev-manufacturer")
public class PowerDevManufacturerController {
    private IPowerDevManufacturerService powerDevManufacturerService;
    private PowerDevManufacturerController(IPowerDevManufacturerService powerDevManufacturerService){
        this.powerDevManufacturerService = powerDevManufacturerService;
    }

    @PostMapping("POST/powerDevManufacturer")
    public MessageBean addPowerDevManufacturer(String name){
        return powerDevManufacturerService.addPowerDevManufacturer(name);
    }

    @DeleteMapping("DELETE/powerDevManufacturer")
    public MessageBean deletePowerDevManufacturer(Long id){
        return powerDevManufacturerService.deletePowerDevManufacturer(id);
    }

    @PutMapping("PUT/powerDevManufacturer")
    public MessageBean putPowerDevManufacturer(PowerDevManufacturer powerDevManufacturer){
        return powerDevManufacturerService.putPowerDevManufacturer(powerDevManufacturer);
    }

    @GetMapping("GET/powerDevManufacturers")
    public MessageBean getPowerDevManufacturers(PowerDevManufacturerParam powerDevManufacturerParam){
        return powerDevManufacturerService.getPowerDevManufacturers(powerDevManufacturerParam);
    }

}
