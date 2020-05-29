package com.axy.intelligentcontrolplatform.standing.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycKzcsDy;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycKzcsDyParam;
import com.axy.intelligentcontrolplatform.standing.service.ITSbZnycKzcsDyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 设备部件附件扩展参数定义表(库) 前端控制器
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@RestController
@RequestMapping("/standing/parts-param-define")
public class TSbZnycKzcsDyController {

    @Autowired
    private ITSbZnycKzcsDyService itSbZnycKzcsDyService;

    @GetMapping("GET/partsParamDefine")
    public MessageBean getPartsParamDefine(TSbZnycKzcsDyParam param){
        return itSbZnycKzcsDyService.getPartsParamDefine(param);
    }
    @PostMapping("POST/partsParamDefine")
    public MessageBean postPartsParamDefine(TSbZnycKzcsDy tSbZnycKzcsDy){
        return itSbZnycKzcsDyService.postPartsParamDefine(tSbZnycKzcsDy);
    }
    @PutMapping("PUT/partsParamDefine")
    public MessageBean putPartsParamDefine(TSbZnycKzcsDy tSbZnycKzcsDy){
        return itSbZnycKzcsDyService.postPartsParamDefine(tSbZnycKzcsDy);
    }
    @DeleteMapping("DELETE/partsParamDefine")
    public MessageBean deletePartsParamDefine(String objId){
        return itSbZnycKzcsDyService.deletePartsParamDefine(objId);
    }

}
