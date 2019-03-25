package com.titian.familytree.service.service;

import com.titian.familytree.bean.HumanInfo;
import com.titian.familytree.bean.vo.HumanInfoVO;

import java.util.List;


public interface HumanInfoService {

    public int addHumanInfo(HumanInfoVO humanInfoVO);

    public int deleteHumanInfo(HumanInfoVO humanInfoVO);

    public int updateHumanInfo(HumanInfoVO humanInfoVO);

    public List<HumanInfo> findHumanInfo(HumanInfoVO humanInfoVO);


}
