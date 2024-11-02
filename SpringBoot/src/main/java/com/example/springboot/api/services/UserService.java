package com.example.springboot.api.services;

import com.example.springboot.api.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
}