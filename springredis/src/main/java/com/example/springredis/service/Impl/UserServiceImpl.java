package com.example.springredis.service.Impl;

import com.example.springredis.Dao.UserDao;
import com.example.springredis.entity.User;
import com.example.springredis.service.UserService;
import com.example.springredis.util.RedisUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Autowired
    RedisUtil redisUtil;

    @Override
    public List<User> findAll() {
//        redisUtil.set("redisAll",userDao.findAll());
//        System.out.println(redisUtil.get("redisAll"));
        redisUtil.get("all");
        return userDao.findAll();
    }

    @Override
    public int insertUser(String name, int age) {
        return userDao.insertUser(name,age);
    }

    @Override
    public int deleteById(int id) {
        return userDao.deleteById(id);
    }

    @Override
    public int updateUser(int id, String name, int age) {
        return userDao.updateUser(id,name,age);
    }

    public User save(User user){
        return userDao.save(user);
    }

    public int delete(int id){
        return userDao.deleteById(id);
    }

    public User update(User user){
        return userDao.save(user);
    }
}