package com.health.service;

import java.util.List;

import com.health.entity.User;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    void deleteUser(Long id);
}