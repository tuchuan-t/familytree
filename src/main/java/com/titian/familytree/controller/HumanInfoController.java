package com.titian.familytree.controller;


import com.titian.familytree.bean.vo.HumanInfoVO;
import com.titian.familytree.service.service.HumanInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/human")
public class HumanInfoController {


    @Autowired
    private HumanInfoService humanInfoService;

    @RequestMapping(value = "/addhuman", method = RequestMethod.POST)
    public int addHumanInfo (HumanInfoVO humanInfoVO){
        return humanInfoService.addHumanInfo(humanInfoVO);
    }


    @RequestMapping(value = "/deletehuman",method = RequestMethod.POST)
    public int deleteHumanInfo(HumanInfoVO humanInfoVO) {
        return (int) humanInfoService.deleteHumanInfo(humanInfoVO);
    }


    @RequestMapping(value = "/updatehuman" ,method = RequestMethod.POST)
    public int updateHumanInfo(HumanInfoVO humanInfoVO){
        return humanInfoService.updateHumanInfo(humanInfoVO);
    }

}
