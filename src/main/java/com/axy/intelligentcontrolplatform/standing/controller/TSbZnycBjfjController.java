package com.axy.intelligentcontrolplatform.standing.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TSbZnycBjfj;
import com.axy.intelligentcontrolplatform.standing.requestParam.TSbZnycBjfjParam;
import com.axy.intelligentcontrolplatform.standing.service.ITSbZnycBjfjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 部件附件 前端控制器
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@RestController
@RequestMapping("/standing/parts-accessories")
public class TSbZnycBjfjController {

    @Autowired
    private ITSbZnycBjfjService itSbZnycBjfjService;

    @GetMapping("GET/partsAccessories")
    public MessageBean getPartsAccessories(TSbZnycBjfjParam param){
        return itSbZnycBjfjService.getPartsAccessories(param);
    }
    @PostMapping("POST/partsAccessories")
    public MessageBean postPartsAccessories(TSbZnycBjfj tSbZnycBjfj){
        return itSbZnycBjfjService.postPartsAccessories(tSbZnycBjfj);
    }
    @PutMapping("PUT/partsAccessories")
    public MessageBean putPartsAccessories(TSbZnycBjfj tSbZnycBjfj){
        return itSbZnycBjfjService.postPartsAccessories(tSbZnycBjfj);
    }
    @DeleteMapping("DELETE/partsAccessories")
    public MessageBean deletePartsAccessories(String objId){
        return itSbZnycBjfjService.deletePartsAccessories(objId);
    }
}
