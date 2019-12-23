/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package com.example.demo.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

@Configuration
//@Configuration
@AutoConfigureAfter(MybatisTableConfig.class)
public class MybatisPlusConfig {

    /**
     *   mapper-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() throws Exception{
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setBasePackage("com.example.mapper.*;com.gitee.sunchenbin.mybatis.actable.dao.*");
//        这个地方容易出错，自己的mapper是在resources中，取得例子是在com.exanple.demo.mapper中；...加个demo目录。
        mapperScannerConfigurer.setBasePackage("com.example.demo.mapper.*;com.gitee.sunchenbin.mybatis.actable.dao.*");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return mapperScannerConfigurer;
    }


}