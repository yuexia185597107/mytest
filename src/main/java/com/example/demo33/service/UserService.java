package com.example.demo33.service;

//import com.example.demo.model.User;
import com.example.demo33.mapper.UserMapper;
import com.example.demo33.model.GongShangH;
import com.example.demo33.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Autowired
//    @Resource
    private UserMapper userMapper;
//    List<User> findAll();   public User hello() {   private

    public List<User> findAll() {
        return userMapper.findAll();
    }
    public List<GongShangH> findAllGongShangH() {
        return userMapper.findAllGongShangH();
    }
}
