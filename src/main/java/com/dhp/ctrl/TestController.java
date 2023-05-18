package com.dhp.ctrl;

import com.dhp.dao.mapper.UserMapper;
import com.dhp.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    UserMapper userMapper;

    @RequestMapping("/test")
    public String test() {
        return "hello world!";
    }

    @RequestMapping("/user")
    public List<User> fetchUsers() {
        List<User> users = userMapper.selectList(null);
        return users;
    }
}
