package com.titian.familytree.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.titian.familytree.bean.User;
import com.titian.familytree.bean.vo.UserVO;
import com.titian.familytree.mapper.UserMapper;
import com.titian.familytree.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public PageInfo<UserVO> findUserByUserName(String userName, int pageNum) {
        /***
         * pageHelper 分页
         */
        int pageSize=5;

        PageHelper.startPage(pageNum,pageSize);

        List<UserVO> listUsers = userMapper.findUserByUserName(userName);

        PageInfo<UserVO> pageInfo = new PageInfo<>(listUsers);

        return pageInfo;
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

}


