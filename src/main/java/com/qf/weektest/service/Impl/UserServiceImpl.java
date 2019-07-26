package com.qf.weektest.service.Impl;

import com.qf.weektest.dao.UserDao;
import com.qf.weektest.entity.User;
import com.qf.weektest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findByName(String username) {
        return userDao.findByName(username);
    }

    @Override
    public boolean findByNameAndPassword(User user) {
        User u = userDao.findByNameAndPassword(user);
        if (u == null) {
            return false;
        }
        return true;
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
