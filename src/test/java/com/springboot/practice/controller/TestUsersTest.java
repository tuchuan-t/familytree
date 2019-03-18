package com.springboot.practice.controller;

import com.springboot.familytree.bean.User;
import com.springboot.familytree.service.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestUsersTest {



    @Resource
    UserService userService;


    @Test
    @Transactional
    @Rollback
    public void addUser() {
        User user = new User();
        user.setAge(10);
        user.setUsername("titian03133");
        user.setPassword("00");
        assertTrue(userService.addUser(user)==1);
    }

    @Test
    @Transactional
    @Rollback
    public void addUserNull() {
        User user = new User();
        user.setAge(12);
        user.setUsername("titian03134");
        user.setPassword("");
        assertTrue(userService.addUser(user)==1);
    }


}