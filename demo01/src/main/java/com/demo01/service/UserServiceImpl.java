package com.demo01.service;

import com.demo01.dao.UserDao;
import com.demo01.dao.UserDaoImpl;
import com.demo01.dao.UserDaoMysqlImpl;
import com.demo01.dao.UserOracleImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
