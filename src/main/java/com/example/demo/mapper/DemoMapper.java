package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.User;

/**
 * Created by lipeishen on 2019/9/15.
 */
public interface DemoMapper extends BaseMapper<User>{

   User hello();


}


