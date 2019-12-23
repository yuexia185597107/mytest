package com.example.demo.controller;

import com.example.demo.dto.TreeNode;
import com.example.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//import org.apache.struts2.ServletActionContext;
//@Component
//@Scope("prototype")
//@RestController
@Controller
public class MenuAction {
    @Autowired
    private MenuService menuService;
    private Integer roleId;
    private Integer[] menuIds;
    @Resource
    public void setMenuService(MenuService menuService) {
        this.menuService = menuService;
    }
    @RequestMapping("/menuAction/find4tree")
//    @ResponseBody
    public String find4tree(Model model){
//  占时不会      ServletActionContext.getResponse();
//返回实体类？  还是返回页面？ 多尝试。。
        List<TreeNode> list2=menuService.find4tree();
        model.addAttribute("a",list2);
        System.out.println("URL进入MenuAction的find4tree方法");
        return "grant02";
    }
    @RequestMapping("/menuAction/select")
//    @ResponseBody
    public String select(){
        menuService.select(roleId, menuIds);
        System.out.println("URL进入MenuAction的selec方法t");
        return null;
    }
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer[] getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(Integer[] menuIds) {
        this.menuIds = menuIds;
    }

    public MenuService getMenuService() {
        return menuService;
    }
}
