package com.example.demo.controller;

//import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.User01;
import com.example.demo.service.DemoService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lipeishen on 2019/9/15.
 */
//@RestController
@Controller
public class HelloController  {

    @Autowired
    private DemoService demoService;

    public DemoService getDemoService() {
        return demoService;
    }
    @Resource
    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

//    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "hello  0000";
    }
    @RequestMapping("/grant01")
    public String hello02() {
        return "grant";
    }

    @RequestMapping("/get")
    @ResponseBody
    public List<User01> get(long id) {
        List<User01> user = demoService.getOne(id);
//        return user.indexOf(1).getName();
        return user;
    }

    @RequestMapping("/post")
    @ResponseBody
    public String post() {
        User01 user = demoService.post();
        return user.getName();
    }

    @RequestMapping("/test01")
    public String hello01(Model model) {
//        model.addAttribute(s:"msg",o:"第二个他到底是姓蒋还是姓汪");
        model.addAttribute("msg","第二个他到底是姓蒋还是姓汪");
        return "hello1";
    }
    @RequestMapping("/test02")
    public String hello02(Model model) {
        List<User> students=new ArrayList<>();
        students.add(new User(1,"张三","张三",null));
        students.add(new User(2,"李四","李四",null));
        students.add(new User(3,"王五","王五",null));
        students.add(new User(4,"二麻","二麻",null));
        model.addAttribute("students",students);
        return "hello1";
    }
}
