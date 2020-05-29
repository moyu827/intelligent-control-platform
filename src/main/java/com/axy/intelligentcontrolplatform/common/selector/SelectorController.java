package com.axy.intelligentcontrolplatform.common.selector;

import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.experiment.entity.TZhZtjxSymb;
import com.axy.intelligentcontrolplatform.experiment.service.ITZhZtjxSymbService;
import com.axy.intelligentcontrolplatform.standing.entity.*;
import com.axy.intelligentcontrolplatform.standing.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 下拉框选择：
 *
 * @author: li wenqiang
 * @date: 2020/5/19 11:13
 */
@RestController
@RequestMapping("/select")
public class SelectorController {

    @Autowired
    private ITDwBzzxSbflService itDwBzzxSbflService;

    @Autowired
    private ITDwBzzxSccjService itDwBzzxSccjService;

    @Autowired
    private ITSbZnycKzcsDyService itSbZnycKzcsDyService;

    @Autowired
    private ITSbZnycBjfjService itSbZnycBjfjService;

    @Autowired
    private ITDwBzzxBzflbService itDwBzzxBzflbService;

    @Autowired
    private ITZhZtjxSymbService itZhZtjxSymbService;

    public SelectorController() {
    }

    @GetMapping("GET/selectPortsType")
    public MessageBean selectPortsType(TDwBzzxSbfl tDwBzzxSbfl){
        return itDwBzzxSbflService.selectPartsType(tDwBzzxSbfl);
    }

    @GetMapping("GET/selectMfrs")
    public MessageBean selectMfrs(TDwBzzxSccj tDwBzzxSccj){
        return itDwBzzxSccjService.selectMfrs(tDwBzzxSccj);
    }

    @GetMapping("GET/selectPartsParamDefine")
    public MessageBean selectPartsParamDefine(TSbZnycKzcsDy tSbZnycKzcsDy){
        return itSbZnycKzcsDyService.selectPartsParamDefine(tSbZnycKzcsDy);
    }

    @GetMapping("GET/selectPartsAccessories")
    public MessageBean selectPartsAccessories(TSbZnycBjfj tSbZnycBjfj){
        return itSbZnycBjfjService.selectPartsAccessories(tSbZnycBjfj);
    }

    @GetMapping("GET/selectNormalSort")
    public MessageBean selectNormalSort(TDwBzzxBzflb tDwBzzxBzflb){
        return itDwBzzxBzflbService.selectNormalSort(tDwBzzxBzflb);
    }
    @GetMapping("GET/selectExperimentTemp")
    public MessageBean selectExperimentTemp(TZhZtjxSymb tZhZtjxSymb){
        return itZhZtjxSymbService.selectExperimentTemp(tZhZtjxSymb);
    }
}
