package com.springboot.familytree.service.impl;

import com.springboot.familytree.bean.User;
import com.springboot.familytree.mapper.UserMapper;
import com.springboot.familytree.service.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public List<User> findUserByUserName(String userName) {
        List<User> list = userMapper.findUserByUserName(userName);
        return list;
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


