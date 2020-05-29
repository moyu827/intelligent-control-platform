package com.axy.intelligentcontrolplatform.bus.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.bus.entity.VoltageLevel;
import com.axy.intelligentcontrolplatform.bus.requestParam.VoltageLevelParam;
import com.axy.intelligentcontrolplatform.bus.service.IVoltageLevelService;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 电压等级表 前端控制器
 * </p>
 *
 * @author yct
 * @since 2020-05-11
 */
@RestController
@RequestMapping("/bus/voltage-level")
public class VoltageLevelController {
    private IVoltageLevelService voltageLevelService;
    private VoltageLevelController(IVoltageLevelService voltageLevelService){
        this.voltageLevelService = voltageLevelService;
    }

    @PostMapping("POST/voltageLevel")
    public MessageBean addVoltageLevel(VoltageLevel voltageLevel){
        return voltageLevelService.addVoltageLevel(voltageLevel);
    }

    @DeleteMapping("DELETE/voltageLevel")
    public MessageBean deleteVoltageLevel(Long id){
        return voltageLevelService.deleteVoltageLevel(id);
    }

    @PutMapping("PUT/voltageLevel")
    public MessageBean putVoltageLevel(VoltageLevel voltageLevel){
        return voltageLevelService.putVoltageLevel(voltageLevel);
    }

    @GetMapping("GET/voltageLevels")
    public MessageBean getVoltageLevels(VoltageLevelParam voltageLevelParam){
        return voltageLevelService.getVoltageLevels(voltageLevelParam);
    }

}
