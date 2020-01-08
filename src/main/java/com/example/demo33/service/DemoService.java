package com.example.demo33.service;

import com.example.demo33.mapper.DemoMapper;
import com.example.demo33.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
