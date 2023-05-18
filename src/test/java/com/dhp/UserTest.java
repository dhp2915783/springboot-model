package com.dhp;

import com.dhp.dao.mapper.UserMapper;
import com.dhp.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UserTest {
    @Resource
    public  UserMapper userMapper;

    @Test
    void queryUser() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
