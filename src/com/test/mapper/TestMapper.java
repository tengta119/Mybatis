package com.test.mapper;

import com.test.entity.User;

import java.util.List;
import java.util.Map;

public interface TestMapper {
    List<User> selectAllUser();
    User selectUserById(int id);
    User selectUserByIdAndAge(int id, int age);
    int insertUser(User user);
    int updateAgeById(User user);
}
