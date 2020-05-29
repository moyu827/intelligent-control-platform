package com.axy.intelligentcontrolplatform.standing.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxSbfl;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxSbflParam;
import com.axy.intelligentcontrolplatform.standing.service.ITDwBzzxSbflService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 设备类型表 前端控制器
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@RestController
@RequestMapping("/standing/parts-type")
public class TDwBzzxSbflController {

    @Autowired
    private ITDwBzzxSbflService itDwBzzxSbflService;

    @GetMapping("GET/partsType")
    public MessageBean getPartsType(TDwBzzxSbflParam param){
        return itDwBzzxSbflService.getPartsType(param);
    }

    @PostMapping("POST/partsType")
    public MessageBean postPartsType(TDwBzzxSbfl tDwBzzxSbfl){
        return itDwBzzxSbflService.postPartsType(tDwBzzxSbfl);
    }

    @PutMapping("PUT/partsType")
    public MessageBean putPartsType(TDwBzzxSbfl tDwBzzxSbfl){
        return itDwBzzxSbflService.postPartsType(tDwBzzxSbfl);
    }
    @DeleteMapping("DELETE/partsType")
    public MessageBean deletePartsType(String objId){
        return itDwBzzxSbflService.deletePartsType(objId);
    }

}
