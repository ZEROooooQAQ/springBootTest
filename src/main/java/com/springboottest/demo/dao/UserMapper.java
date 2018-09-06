package com.springboottest.demo.dao;

import com.springboottest.demo.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Description: Date Access Object
 * <p>
 * Created by jianwuli on 2018/9/6 20:31
 */
@Repository
public interface UserMapper {

    Integer enroll(User user);
}
