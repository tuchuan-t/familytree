package com.springboot.familytree.service.impl;

import com.springboot.familytree.bean.HumanInfo;
import com.springboot.familytree.bean.vo.HumanInfoVO;
import com.springboot.familytree.mapper.HumanInfoMapper;
import com.springboot.familytree.service.service.HumanInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class HumanInfoServiceImpl implements HumanInfoService {

    @Resource
    private HumanInfoMapper humanInfoMapper;

    /**
     * 增加成员信息
     *
     * @param humanInfoVO
     * @return
     */
    public int addHumanInfo(HumanInfoVO humanInfoVO) {
        HumanInfo humanInfo_exist = humanInfoMapper.checkHumanInfoByIdentity(humanInfoVO);
        if(humanInfo_exist == null ){
            return humanInfoMapper.addHumanInfo(humanInfoVO);
        }else{
            return 0;
        }
    }

    /**
     * 删除成员信息
     *
     * @param humanInfoVO
     * @return
     */
    public int deleteHumanInfo(HumanInfoVO humanInfoVO) {
        if (humanInfoVO.getId() != 0) {
            return humanInfoMapper.deleteHumanInfo(humanInfoVO);
        } else {
            return 0;
        }
    }

    /**
     * 修改成员信息
     *
     * @param humanInfoVO
     * @return
     */
    public int updateHumanInfo(HumanInfoVO humanInfoVO) {
        HumanInfo humanInfo = humanInfoMapper.checkHumanInfoById(humanInfoVO);
        if(humanInfo.getId()!=0){
            return humanInfoMapper.updateHumanInfo(humanInfoVO);
        }else{
            return 0;
        }
    }

    /**
     * 查询成员信息
     *
     * @param humanInfoVO
     * @return
     */
    public List<HumanInfo> findHumanInfo(HumanInfoVO humanInfoVO) {
        return humanInfoMapper.findHumanInfo(humanInfoVO);
    }
}
