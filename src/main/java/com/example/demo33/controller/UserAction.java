package com.example.demo33.controller;

//import com.example.demo.model.User;
//import com.example.demo.service.UserService;
import com.example.demo33.model.GongShangH;
import com.example.demo33.model.User;
import com.example.demo33.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

//@Component
//@Scope("prototype")
//@RestController
@Controller
public class UserAction {
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
    public String add(){//??
        return null;
    }

    @RequestMapping("/index2")
    public String toindex() {
        return "index";
    }
    @RequestMapping("/userAction/findAll")
//    @ResponseBody
    public String findAll(Model model){
        List<User> user=userService.findAll();
        model.addAttribute("a",user);
        return "menubig";
    }
    @RequestMapping("/gongshanghetong")
    public String togongshanghetong(Model model) {

        List<GongShangH> listss=userService.findAllGongShangH();
        model.addAttribute("listss",listss);
        return "gongshanghetong";
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
