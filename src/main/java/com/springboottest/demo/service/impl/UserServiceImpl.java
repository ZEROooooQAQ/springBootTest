package com.springboottest.demo.service.impl;

import com.springboottest.demo.dao.UserMapper;
import com.springboottest.demo.domain.User;
import com.springboottest.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: 接口实现类
 * <p>
 * Created by jianwuli on 2018/9/6 20:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Boolean enroll(User user) {
        return userMapper.enroll(user) > 0;
    }
}
