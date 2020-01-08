package com.example.demo33.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo33.model.Node;

import java.util.List;

/**
 * Created by lipeishen on 2019/12/30.
 */
public interface NodeMapper extends BaseMapper<Node> {

    public List<Node> getData();
}
