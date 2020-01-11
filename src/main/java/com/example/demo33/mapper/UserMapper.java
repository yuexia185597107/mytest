package com.example.demo33.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.example.demo.model.User;
import com.example.demo33.model.GongShangH;
import com.example.demo33.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
   @Select("select * from user3")
   List<User> findAll();

    @Select("select * from gongshang_h")
    List<GongShangH> findAllGongShangH();
}
