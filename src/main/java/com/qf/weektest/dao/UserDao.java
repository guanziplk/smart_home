package com.qf.weektest.dao;

import com.qf.weektest.entity.User;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    List<User> findAll();

    User findByName(String username);

    User findByNameAndPassword(User user);

    int addUser(User user);
}
