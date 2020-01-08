package com.example.demo33.service;

//import com.example.demo.mapper.NodeMapper;
import com.example.demo33.mapper.NodeMapper;
import com.example.demo33.model.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lipeishen on 2019/12/30.
 */
@Service
public class NodeService {

    @Autowired
    private NodeMapper nodeMapper;

    public List<Node> getData() {

        List<Node> nodes = nodeMapper.getData();
        return nodes;
    }
}

