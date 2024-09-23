package com.test.mapper;
import com.test.entity.User;
import java.util.List;

public interface TestMapper {
    List<User> selectAllUser();
    User selectUserById(int id);
    User selectUserByIdAndAge(int id, int age);
    int insertUser(User user);
    int updateAgeById(User user);
    int insertUsers(List<String> users);
}
