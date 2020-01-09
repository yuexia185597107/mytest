package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.dto.RoleDto;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.model.User01;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RoleMapper extends BaseMapper<Role> {
    @Select("select * from t_role2")
    List<Role> findAll();
    @Select("select * from t_role2 where id=#{id}")
    Role getRole(@Param("roleId") Integer roleId);

    @Select("select *  from t_role2 r where r.id=#{roleId}")
    List<RoleDto> getRoleDto(@Param("roleId") Integer roleId);
    @Select("select * from t_role2 r where r.id not in (select r2.id from t_role2 r2 where r2.id=#{roleId})")
    List<RoleDto> getNotRoleDto(@Param("roleId") Integer roleId);

    @Select("select * from t_user2 where id=#{userId}")
    User getUser(@Param("userId") Integer userId);

//    @Update("UPDATE t_role2_t_user2  SET users_id=#{userId} , roles_id=#{roleId} WHERE users_id=#{userId}")
    @Delete("DELETE FROM t_role2_t_user2 WHERE users_id=#{userId}")
    void delRelation(@Param("userId") Integer userId,@Param("roleId") Integer roleId);

//    @Update("UPDATE t_role2_t_user2  SET users_id=#{userId} , roles_id=#{roleId} WHERE users_id=#{userId}")
    @Insert("INSERT INTO t_role2_t_user2 (users_id,roles_id) VALUES(#{userId},#{roleId})")
    void addRelation(@Param("userId")Integer userId,@Param("roleId") Integer roleId);

}
