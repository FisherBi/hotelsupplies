package com.benjamin.service;

import com.benjamin.dao.UserDao;
import com.benjamin.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by piqiu on 2/23/16.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUserByUserName(String userName) {
        return userDao.findUniqueBy("userName", userName);
    }

}