package com.example.demo.model;

import java.util.List;
import java.util.Map;

/**
 * Created by lipeishen on 2019/12/29.
 */
public class ZTreeNode {

    private int id;
    private int pid;
    private String name;
    private boolean open;
    private List<Map<String,String>> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public List<Map<String, String>> getChildren() {
        return children;
    }

    public void setChildren(List<Map<String, String>> children) {
        this.children = children;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
