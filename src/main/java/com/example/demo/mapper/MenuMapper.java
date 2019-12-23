package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.Menu;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface
MenuMapper extends BaseMapper<Menu> {
//    get(Role, roleId);     #{id}   @Param("id")或者@Param(value="id")
    @Select("select * from t_role2 where id=#{id}")
    Role getRole(@Param("id") Integer roleId);
    @Select("select * from t_menu2 where id=#{id}")
    Menu getMenu(@Param("id") Integer menuIds);
    @Select("select * from t_menu2")
    List<Menu> getAllMenu();

// @Override
//getClass();
}
