package com.axy.intelligentcontrolplatform.standing.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycKzcs;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycKzcsParam;
import com.axy.intelligentcontrolplatform.standing.service.ITSbZnycKzcsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 设备部件附件扩展参数表 前端控制器
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@RestController
@RequestMapping("/standing/parts-param")
public class TSbZnycKzcsController {

    @Autowired
    private ITSbZnycKzcsService itSbZnycKzcsService;

    @GetMapping("GET/partsParam")
    public MessageBean getPartsParam(TSbZnycKzcsParam param){
        return itSbZnycKzcsService.getPartsParam(param);
    }

    @PostMapping("POST/partsParam")
    public MessageBean postPartsParam(TSbZnycKzcs tSbZnycKzcs){
        return itSbZnycKzcsService.postPartsParam(tSbZnycKzcs);
    }
    @PutMapping("PUT/partsParam")
    public MessageBean putPartsParam(TSbZnycKzcs tSbZnycKzcs){
        return itSbZnycKzcsService.postPartsParam(tSbZnycKzcs);
    }

    @DeleteMapping("DELETE/partsParam")
    public MessageBean deletePartsParam(String objId){
        return itSbZnycKzcsService.deletePartsParam(objId);
    }

}
