package com.example.demo33.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo33.model.User;

/**
 * Created by lipeishen on 2019/9/15.
 */
public interface DemoMapper extends BaseMapper<User>{

   User hello();


}


