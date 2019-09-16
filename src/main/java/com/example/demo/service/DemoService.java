package com.example.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.model.User;

/**
 * Created by lipeishen on 2019/9/15.
 */
@Service
public class DemoService {

    @Resource
    private DemoMapper demoMapper;

    public User hello() {

        return demoMapper.hello();
    }

    public User getOne(long id) {
        return demoMapper.selectById(id);
    }

}
