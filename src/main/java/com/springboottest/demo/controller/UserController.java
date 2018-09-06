package com.springboottest.demo.controller;

import com.springboottest.demo.domain.User;
import com.springboottest.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: UserController
 * <p>
 * Created by jianwuli on 2018/9/6 20:33
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "enroll")
    public String enroll(User user) {
        if (userService.enroll(user)) {
            return "注册成功!";
        }
        return "注册失败!";
    }
}
