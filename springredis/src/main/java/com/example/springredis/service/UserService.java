package com.example.springredis.service;

import com.example.springredis.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    int insertUser(String name,int age);
    int deleteById(int id);
    int updateUser(int id,String name,int age);
}