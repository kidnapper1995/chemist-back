package com.anshanUnicom.chemist.controller;

import com.anshanUnicom.chemist.entity.Msg;
import com.anshanUnicom.chemist.service.ChemistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ning Baoqi
 * @date 2021/3/3 18:15
 */
@RestController
public class ChemistController {
    @Autowired
    ChemistService chemistService;
    @RequestMapping("/api/request")
    public Object chemist(@RequestParam(value = "mobile") String mobile){
        Msg msg=new Msg();
        msg.setMsg(chemistService.getResult(mobile));
        return msg;
    }
}
