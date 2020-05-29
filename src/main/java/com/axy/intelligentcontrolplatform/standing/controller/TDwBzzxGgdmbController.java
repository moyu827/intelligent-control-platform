package com.axy.intelligentcontrolplatform.standing.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxGgdmb;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxGgdmbParam;
import com.axy.intelligentcontrolplatform.standing.service.ITDwBzzxGgdmbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 公共代码表 前端控制器
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@RestController
@RequestMapping("/standing/common-code")
public class TDwBzzxGgdmbController {

    @Autowired
    private ITDwBzzxGgdmbService itDwBzzxGgdmbService;
    @GetMapping("GET/commonCode")
    public MessageBean getCommonCode(TDwBzzxGgdmbParam param){
        return itDwBzzxGgdmbService.getCommonCode(param);
    }
    @PostMapping("POST/commonCode")
    public MessageBean postCommonCode(TDwBzzxGgdmb tDwBzzxGgdmb){
        return itDwBzzxGgdmbService.postCommonCode(tDwBzzxGgdmb);
    }
    @PutMapping("PUT/commonCode")
    public MessageBean putCommonCode(TDwBzzxGgdmb tDwBzzxGgdmb){
        return itDwBzzxGgdmbService.postCommonCode(tDwBzzxGgdmb);
    }
    @DeleteMapping("DELETE/commonCode")
    public MessageBean deleteCommonCode(String objId){
        return itDwBzzxGgdmbService.deleteCommonCode(objId);
    }

}
