package com.qf.weektest.service;

import com.qf.weektest.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    User findByName(String username);

    boolean findByNameAndPassword(User user);

    int addUser(User user);
}
