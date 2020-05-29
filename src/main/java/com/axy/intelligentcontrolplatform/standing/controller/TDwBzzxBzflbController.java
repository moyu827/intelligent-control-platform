package com.axy.intelligentcontrolplatform.standing.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxBzflb;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxBzflbParam;
import com.axy.intelligentcontrolplatform.standing.service.ITDwBzzxBzflbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 标准分类表 前端控制器
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@RestController
@RequestMapping("/standing/normal-sort")
public class TDwBzzxBzflbController {

    @Autowired
    private ITDwBzzxBzflbService itDwBzzxBzflbService;

    @GetMapping("GET/normalSort")
    public MessageBean getNormalSort(TDwBzzxBzflbParam param){
        return itDwBzzxBzflbService.getNormalSort(param);
    }
    @PostMapping("POST/normalSort")
    public MessageBean postNormalSort(TDwBzzxBzflb tDwBzzxBzflb){
        return itDwBzzxBzflbService.postNormalSort(tDwBzzxBzflb);
    }
    @PutMapping("PUT/normalSort")
    public MessageBean putNormalSort(TDwBzzxBzflb tDwBzzxBzflb){
        return itDwBzzxBzflbService.postNormalSort(tDwBzzxBzflb);
    }
    @DeleteMapping("DELETE/normalSort")
    public MessageBean deleteNormalSort(String objId){
        return itDwBzzxBzflbService.deleteNormalSort(objId);
    }

}
