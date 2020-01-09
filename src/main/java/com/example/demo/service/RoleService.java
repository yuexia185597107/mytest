package com.example.demo.service;

import com.example.demo.dto.RoleDto;
import com.example.demo.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RoleService {
    //根据userId查询，此用户已经拥有的所有角色；
    List<RoleDto> findByUser(Integer userId);
    List<RoleDto> findNoByUser(Integer userId);
    void addRelation(Integer userId,Integer roleId);
    void delRelation(Integer userId,Integer roleId);
    List<Role> findAll();
}
