package com.titian.familytree.service.service;

import com.titian.familytree.bean.User;

import java.util.List;

public interface UserService {

    /**
     * 根据用户名查找User
     * @param userName
     * @return
     */
    public List<User> findUserByUserName(String userName);

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);


    /**
     * 删除用户
     * @param id
     * @return
     */
    public int deleteUser(int id);

    /**
     * 更新用户
     * @param user
     * @return
     */
    public int updateUser(User user);


}
