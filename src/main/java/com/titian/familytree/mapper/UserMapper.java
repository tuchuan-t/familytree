package com.titian.familytree.mapper;


import com.titian.familytree.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<User> findUserByUserName(String username);

    public int addUser(User user);

    public int deleteUser(int id);

    public int updateUser(User user);

}
