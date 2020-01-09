package com.example.demo.serviceimpl;

import com.example.demo.dto.RoleDto;
import com.example.demo.mapper.RoleMapper;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

//@Component
@ComponentScan(basePackages = "com.example.demo.mapper")
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    public RoleMapper getRoleMapper() {
        return roleMapper;
    }
    @Resource
    public void setRoleMapper(RoleMapper roleMapper) {
        this.roleMapper = roleMapper;
    }
    @Override
    public List<RoleDto> findByUser(Integer userId) {
//        String hql="";
//                "select new com.bjsxt.dto.RoleDto(r.id,r.name)  from Roler r.id not in (select r2.id from Role r2 where r2.users.id?)";
//        "select from t_role r where ";
        List<RoleDto> a= roleMapper.getRoleDto(userId);
        return  a;
//                (List<RoleDto>) hibernateTemplate.find(hql, userId);
    }

    @Override
    public List<RoleDto> findNoByUser(Integer userId) {
//        String hql="select new com.bjsxt.dto.RoleDto(r.id,r.name)  from Role r where r.users.id=?";
        List<RoleDto> a= roleMapper.getNotRoleDto(userId);
        return a;
//                (List<RoleDto>) hibernateTemplate.find(hql, new Object[]{userId});
    }

    @Override
    public void addRelation(Integer userId, Integer roleId) {
//        Role role=hibernateTemplate.get(Role.class, roleId);
//        User user=hibernateTemplate.get(User.class, userId);
        //private Set<User> users=new HashSet<User>();
//         role.getUsers().add(user);
//        hibernateTemplate.update(role);
        roleMapper.addRelation(userId, roleId);
    }

    @Override
    public void delRelation(Integer userId, Integer roleId) {
//        Role role=hibernateTemplate.get(Role.class, roleId);
//        User user=hibernateTemplate.get(User.class, userId);
        //private Set<User> users=new HashSet<User>();
//        role.getUsers().remove(user);
//        hibernateTemplate.update(role);
          roleMapper.delRelation(userId, roleId);
    }
    @Override
    public List<Role> findAll() {
//        return (List<Role>) hibernateTemplate.find("from Role");
        return  roleMapper.findAll();
    }
}
