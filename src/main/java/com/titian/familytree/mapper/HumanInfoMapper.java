package com.titian.familytree.mapper;


import com.titian.familytree.bean.HumanInfo;
import com.titian.familytree.bean.vo.HumanInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HumanInfoMapper {

    public int addHumanInfo(HumanInfoVO humanInfoVO);

    public int deleteHumanInfo(HumanInfoVO humanInfoVO);

    public int updateHumanInfo(HumanInfoVO humanInfoVO);

    public List<HumanInfo> findHumanInfo(HumanInfoVO humanInfoVO);

    public HumanInfo checkHumanInfoByIdentity(HumanInfoVO humanInfoVO);

    public HumanInfo checkHumanInfoById(HumanInfoVO humanInfoVO);

}
