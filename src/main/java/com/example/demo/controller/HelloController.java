package com.example.demo.controller;

//import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.example.demo.model.User;
import com.example.demo.model.ZTreeNode;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    @RequestMapping("/getTreeData")
    @ResponseBody
    public Object getTreeData() {
        List<ZTreeNode> nodeList = new ArrayList<>();
        ZTreeNode zTreeNode =  new ZTreeNode();
        List<Map<String,String>> c1 = new ArrayList<>();
        Map<String,String> map1 = new HashMap<>();
        map1.put("name","东城区");
        c1.add(map1);
        Map<String,String> map2 = new HashMap<>();
        map2.put("name","朝阳区");
        c1.add(map2);
        zTreeNode.setId(1);
        zTreeNode.setPid(0);
        zTreeNode.setName("北京");
        zTreeNode.setChildren(c1);
        zTreeNode.setOpen(true);
        nodeList.add(zTreeNode);

        ZTreeNode zTreeNode1 =  new ZTreeNode();
        List<Map<String,String>> c2 = new ArrayList<>();
        Map<String,String> map3 = new HashMap<>();
        map3.put("name","巴南区");
        c2.add(map3);
        Map<String,String> map4 = new HashMap<>();
        map4.put("name","渝中区");
        c2.add(map4);

        zTreeNode1.setId(2);
        zTreeNode1.setPid(0);
        zTreeNode1.setName("重庆");
        zTreeNode1.setChildren(c2);
        zTreeNode1.setOpen(true);
        nodeList.add(zTreeNode1);
        return nodeList;

    }
}
