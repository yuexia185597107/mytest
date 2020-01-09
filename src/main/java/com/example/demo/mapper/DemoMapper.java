package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.User01;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lipeishen on 2019/9/15.
 */
@Mapper
public interface DemoMapper extends BaseMapper<User01>{

   User01 hello();
   @Select("select * from user3")
   List<User01> selectById(@Param("id") long id);
//     List<User01> selectById(long id);

   @Select("select * from user3 where id=3")
   User01 post();
}


