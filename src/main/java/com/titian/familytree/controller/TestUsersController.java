package com.titian.familytree.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.titian.familytree.bean.User;
import com.titian.familytree.bean.vo.UserVO;
import com.titian.familytree.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestUsersController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public PageInfo<UserVO> findUsers(@RequestParam(name = "userName") String userName, @RequestParam(name="pageNum") int pageNum) {

        PageInfo<UserVO> page = userService.findUserByUserName(userName,pageNum);

        if (page.getSize() > 0) {
            return page;
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
