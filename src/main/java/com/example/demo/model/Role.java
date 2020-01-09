package com.example.demo.model;

import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="t_role2")
public class Role {
//    @Id
//    @GeneratedValue
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;
    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String name;
    @Column(name = "des",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String des;
    @Column(name = "priority",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String priority;//321
    @ManyToMany
    private Set<Menu> menus=new HashSet<Menu>();
    @ManyToMany
    private Set<User> users=new HashSet<User>();
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public Set<Menu> getMenus() {
        return menus;
    }
    public void setMenus(Set<Menu> menus) {
        this.menus = menus;
    }
    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
    public Role() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Role(Integer id, String name, String des, String priority, Set<Menu> menus, Set<User> users) {
        super();
        this.id = id;
        this.name = name;
        this.des = des;
        this.priority = priority;
        this.menus = menus;
        this.users = users;
    }

}
