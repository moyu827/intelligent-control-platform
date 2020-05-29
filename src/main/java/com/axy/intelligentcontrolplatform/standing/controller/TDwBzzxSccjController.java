package com.axy.intelligentcontrolplatform.standing.controller;


import com.axy.intelligentcontrolplatform.basic.dto.MessageBean;
import com.axy.intelligentcontrolplatform.standing.entity.TDwBzzxSccj;
import com.axy.intelligentcontrolplatform.standing.requestParam.TDwBzzxSccjParam;
import com.axy.intelligentcontrolplatform.standing.service.ITDwBzzxSccjService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 生产厂家 前端控制器
 * </p>
 *
 * @author liwenqiang
 * @since 2020-05-14
 */
@RestController
@RequestMapping("/standing/mfrs")
public class TDwBzzxSccjController {

    @Autowired
    private ITDwBzzxSccjService itDwBzzxSccjService;


    @GetMapping("GET/mfrs")
    public MessageBean getMfrs(TDwBzzxSccjParam tDwBzzxSccjParam){
        return itDwBzzxSccjService.getMfrs(tDwBzzxSccjParam);
    }

    @PostMapping("POST/mfrs")
    public MessageBean postMfrs(TDwBzzxSccj tDwBzzxSccj){
        return itDwBzzxSccjService.postMfrs(tDwBzzxSccj);
    }

    @PutMapping("PUT/mfrs")
    public MessageBean putMfrs(TDwBzzxSccj tDwBzzxSccj){
        return itDwBzzxSccjService.postMfrs(tDwBzzxSccj);
    }

    @DeleteMapping("DELETE/mfrs")
    public MessageBean deleteMfrs(String objId){
        return itDwBzzxSccjService.deleteMfrs(objId);
    }

    @RequestMapping("VIEW/edit-mfrs")
    private ModelAndView goView(String id){
        ModelAndView modelAndView = new ModelAndView("view/mfrs");
        TDwBzzxSccj model = itDwBzzxSccjService.getById(id);
        modelAndView.addObject("model",model);
        return modelAndView;
    }

}
