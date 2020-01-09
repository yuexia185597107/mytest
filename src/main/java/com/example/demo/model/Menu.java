package com.example.demo.model;

import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="t_menu2")
public class Menu {
//    @Id
//    @GeneratedValue
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;
    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String name;
    @Column(name = "url",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String url;
    @Column(name = "des",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String des;
    @Column(name = "parent_id",type = MySqlTypeConstant.VARCHAR,length = 111)
    private Integer parent_id;
    @OneToMany(mappedBy="parent")
    private Set<Menu> children=new HashSet<Menu>();
    @ManyToOne
    private Menu parent;
    @ManyToMany(mappedBy="menus")
    private Set<Role> roles=new HashSet<Role>();

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
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    public Set<Menu> getChildren() {
        return children;
    }
    public void setChildren(Set<Menu> children) {
        this.children = children;
    }
    public Menu getParent() {
        return parent;
    }
    public void setParent(Menu parent) {
        this.parent = parent;
    }
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Menu [id=" + id + ", name=" + name + ", url=" + url + ", des=" + des + ", children=" + children
                + ", parent=" + parent + ", roles=" + roles + "]";
    }
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Menu(Integer id, String name, String url, String des, Set<Menu> children, Menu parent, Set<Role> roles) {
        super();
        this.id = id;
        this.name = name;
        this.url = url;
        this.des = des;
        this.children = children;
        this.parent = parent;
        this.roles = roles;
    }
}
