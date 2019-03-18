package com.titian.familytree.controller;


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
    public List<User> findUsers(@RequestParam(name = "userName") String userName) {
        List<User> list = (List<User>) userService.findUserByUserName(userName);
        if (list.size() > 0) {
            return list;
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
