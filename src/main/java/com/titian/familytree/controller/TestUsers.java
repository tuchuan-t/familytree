package com.titian.familytree.controller;


import com.github.pagehelper.PageInfo;
import com.titian.familytree.bean.User;
import com.titian.familytree.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestUsers {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public PageInfo<User> findUsers(@RequestParam(name = "userName") String userName) {
        PageInfo<User> pagelist = userService.findUserByUserName(userName);

        if (pagelist.getSize() > 0) {
            return pagelist;
        } else {
            return null;
        }
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public int addUser(User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
    public int deleteUser(int id) {
        return userService.deleteUser(id);
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public int updateUser(User user) {
        return userService.updateUser(user);
    }


}
