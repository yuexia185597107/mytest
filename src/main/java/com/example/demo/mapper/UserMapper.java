package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.User;
import com.example.demo.model.User01;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper extends BaseMapper<User> {
   @Select("select * from t_user2")
   List<User> findAll();
}
