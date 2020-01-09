package com.example.demo.dto;

public class TreeNode {
    private Integer id;
    private String name;//节点name
    private Integer pId;
    private String url;
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
    public Integer getpId() {
        return pId;
    }
    public void setpId(Integer pId) {
        this.pId = pId;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public TreeNode() {
        super();
        // TODO Auto-generated constructor stub
    }
    public TreeNode(Integer id, String name, Integer pId, String url) {
        super();
        this.id = id;
        this.name = name;
        this.pId = pId;
        this.url = url;
    }

}
