package com.example.demo33;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo33.mapper")//容易出错
public class Demo33Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo33Application.class, args);
    }
//     System.out.println();
//    System.out.println("启动类的结束。。");
}
