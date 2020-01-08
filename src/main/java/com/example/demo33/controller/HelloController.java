package com.example.demo33.controller;

import com.example.demo33.model.Node;
import com.example.demo33.model.User;
import com.example.demo33.model.ZTreeNode;
import com.example.demo33.service.DemoService;
import com.example.demo33.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lipeishen on 2019/9/15.
 */
@Controller
public class HelloController {

    @Autowired
    private DemoService demoService;

    @Autowired
    private NodeService nodeService;

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        User user = demoService.hello();
        return user.getName();
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get(@RequestParam long id) {
        User user = demoService.getOne(id);
        return user.getName();
    }

    @RequestMapping("/domain")
    @ResponseBody
    public String domain() {

        URL url = null;
        try {
            url = new URL("http://qy.baidu.com.hello.net/#@qy.baidu.com/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        String host = url.getHost();
        if (!org.apache.commons.lang3.StringUtils.endsWithAny(url.getHost(), ".baidu.com", ".baidu-int.com")) {
            boolean urlInvalid = false;
        }

        return host;
    }

    @RequestMapping("/getTreeData")
    @ResponseBody
    public Object getTreeData() {
        List<ZTreeNode> nodeList = new ArrayList<>();
        ZTreeNode zTreeNode = new ZTreeNode();
        List<Map<String, String>> c1 = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("name", "东城区");
        c1.add(map1);
        Map<String, String> map2 = new HashMap<>();
        map2.put("name", "朝阳区");
        c1.add(map2);
        zTreeNode.setId(1);
        zTreeNode.setPid(0);
        zTreeNode.setName("北京");
        zTreeNode.setChildren(c1);
        zTreeNode.setOpen(true);
        nodeList.add(zTreeNode);

        ZTreeNode zTreeNode1 = new ZTreeNode();
        List<Map<String, String>> c2 = new ArrayList<>();
        Map<String, String> map3 = new HashMap<>();
        map3.put("name", "巴南区");
        c2.add(map3);
        Map<String, String> map4 = new HashMap<>();
        map4.put("name", "渝中区");
        c2.add(map4);

        zTreeNode1.setId(2);
        zTreeNode1.setPid(0);
        zTreeNode1.setName("重庆");
        zTreeNode1.setChildren(c2);
        zTreeNode1.setOpen(true);
        nodeList.add(zTreeNode1);
        return nodeList;

    }

    @RequestMapping("/index")
    public String toindex() {
        return "grant02";
    }

    @RequestMapping("/getData/fromDb")
    @ResponseBody
    public Object getDataFromDb() {
        List<Node> nodes = nodeService.getData();
        if (nodes == null || nodes.size() == 0) {
            return null;
        }
        return nodes;

    }

}
