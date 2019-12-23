package com.example.demo.serviceimpl;

import com.example.demo.mapper.DemoMapper;
import com.example.demo.model.User01;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//@Component
//@Component("com.example.demo.mapper")
@ComponentScan(basePackages = "com.example.demo.mapper")
@Service("demoService")
public class DemoMapperImpl implements DemoService {
    @Autowired
    private  DemoMapper demoMapper;

    public DemoMapper getDemoMapper() {
        return demoMapper;
    }
    @Resource
    public void setDemoMapper(DemoMapper demoMapper) {
        this.demoMapper = demoMapper;
    }

    @Override
    public List<User01> getOne(long id) {
        List<User01> user= (List<User01>) demoMapper.selectById(id);
//        return demoMapper.selectById(id);
        return user;
    }

    @Override
    public User01 post() {
        User01 user= (User01) demoMapper.post();
        return user;
    }
}
