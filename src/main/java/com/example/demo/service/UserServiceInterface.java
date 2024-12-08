package com.example.demo.service;

import com.example.demo.models.User;

public interface UserServiceInterface {
    String registerUser(User user);

    boolean authenticateUser(String email, String password);
}
