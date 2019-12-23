package com.example.demo.service;
//import com.bjsxt.dto.TreeNode;
import com.example.demo.dto.TreeNode;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MenuService {
    List<TreeNode> find4tree();
    void select(Integer roleId,Integer[] menuIds);
}



