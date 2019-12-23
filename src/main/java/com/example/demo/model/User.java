package com.example.demo.model;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Entity
@Table(name="t_user2")
public class User extends BaseModel{
    private static final long serialVersionUID = 5199200306752426433L;
//    @Id
//    @GeneratedValue
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;
    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String name;
    @Column(name = "phone",type = MySqlTypeConstant.VARCHAR,length = 111)
    private String phone;

    @ManyToMany(mappedBy="users")
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
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(Integer id, String name, String phone, Set<Role> roles) {
        super();
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.roles = roles;
    }
}
