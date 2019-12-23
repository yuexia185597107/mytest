package com.example.demo.serviceimpl;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.model.User01;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//@Component
@ComponentScan(basePackages = "com.example.demo.mapper")
@Service("uemoService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }
    @Resource
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    @Override
    public List<User> findAll() {
//        String hql="from User";
//        return (List<User>) hibernateTemplate.find(hql);
        List<User> user= userMapper.findAll();
        return user;
    }


}
