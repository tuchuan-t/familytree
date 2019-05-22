package com.titian.familytree.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.titian.familytree.bean.User;
import com.titian.familytree.mapper.UserMapper;
import com.titian.familytree.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public PageInfo<User> findUserByUserName(String userName) {
        /***
         * pageHelper 分页
         */
        int pageNum = 1,pageSize=1;

        PageHelper.startPage(pageNum,pageSize);

        List<User> listTest = userMapper.findUserByUserName(userName);

        PageInfo<User> pagelist = new PageInfo<>(listTest);

        System.out.println(listTest.size()+"||"+pagelist.getSize());

//        List<User> list = userMapper.findUserByUserName(userName);
        return pagelist;
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


