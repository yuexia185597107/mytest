package com.example.demo.controller;

import com.example.demo.dto.RoleDto;
import com.example.demo.model.Role;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

//@Component
//@Scope("prototype")
//@RestController
@Controller
public class RoleAction {
    @Autowired
    private RoleService roleService;
    private Integer userId;
    private Integer roleId;
    private List<Role> list;
    @Resource
    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }
    public RoleService getRoleService() {
        return roleService;
    }

    @RequestMapping("/roleAction/findByUser")
//    @ResponseBody
//    public List<RoleDto> findByUser(Model model,Integer  userId) throws IOException {
    public String findByUser(Model model,Integer  userId) throws IOException {
//		JsonUtil.write2response(roleService.findByUser(userId), ServletActionContext.getResponse());
//    	JsonUtil.write2response(roleService.findByUser(userId), ServletActionContext.getResponse());
//    	JsonUtil.write2response(roleService.findByUser(userId), ServletActionContext.getResponse());
        List<RoleDto> a=roleService.findByUser(userId);
        model.addAttribute("a",a);
//        return roleService.findByUser(userId);
        return "rolelist01";
    }

    @RequestMapping("/roleAction/redirect/grt02")
    public String redirect(Model model,Integer  userId) throws IOException {
        model.addAttribute("userId",userId);
        return "grant02";
    }
    @RequestMapping("/roleAction/findNoByUser")
//    @ResponseBody
    public String findNoByUser(Model model,Integer userId) throws IOException {
//		JsonUtil.write2response(roleService.findNoByUser(userId), ServletActionContext.getResponse());
        List<RoleDto> a=roleService.findNoByUser(userId);
        model.addAttribute("a",a);
        return "rolelist01";
    }
    @RequestMapping("/roleAction/addRelation")
//    @ResponseBody
    public String addRelation(Integer userId,Integer roleId){
        roleService.addRelation(userId, roleId);
        return null;
    }
    @RequestMapping("/roleAction/delRelation")
//    @ResponseBody
    public String delRelation(Integer userId,Integer roleId){
        roleService.delRelation(userId, roleId);
        return null;
    }
    @RequestMapping("/roleAction/findAll")
//    @ResponseBody
    public String findAll(Model model){
        List<Role> a=roleService.findAll();
        model.addAttribute("a",a);
        return "rolelist01";
    }

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
    public List<Role> getList() {
        return list;
    }
    public void setList(List<Role> list) {
        this.list = list;
    }


}
