package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.User;
import com.example.demo.service.DemoService;

/**
 * Created by lipeishen on 2019/9/15.
 */
@Controller
public class HelloController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get(@RequestParam long id) {
        User user = demoService.getOne(id);
        return user.getName();
    }

}
