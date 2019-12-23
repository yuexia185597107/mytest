package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
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
//@Component
//@Scope("prototype")
//@RestController
@Controller
public class UserAction  {
    @Autowired
    private UserService userService;
    private User user;
    private List<User> list;
    @Resource
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/userAction/add")
//    @ResponseBody
    //暂时没有
    public String add(){//??
        return null;
    }

    @RequestMapping("/userAction/findAll")
//    @ResponseBody
    public String findAll(Model model){
        List<User> user=userService.findAll();
        model.addAttribute("a",user);
        return "userccc";

    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public List<User> getList() {
        return list;
    }
    public void setList(List<User> list) {
        this.list = list;
    }
    public UserService getUserService() {
        return userService;
    }

}
