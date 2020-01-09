package com.example.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.model.User01;

import java.util.List;

/**
 * Created by lipeishen on 2019/9/15.
 */
@Service
public interface DemoService {
//public class DemoService {

//    @Resource
//    private DemoMapper demoMapper;
//
//    public User01 hello() {
//
//        return demoMapper.hello();
//    }

//    public User01 getOne(long id) {
//        return demoMapper.selectById(id);
//    }
     public List<User01> getOne(long id);
     public User01 post();
}
