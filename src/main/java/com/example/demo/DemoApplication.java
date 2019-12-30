package com.example.demo;

//import org.apache.catalina.core.StandardService;
import org.apache.catalina.core.StandardEngine;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.ServletContainerInitializer;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.EmbeddedWebApplicationContext;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
//import org.springframework.context.annotation.ConfigurationClassPostProcessor;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
//import org.springframework.web.context.ContextLoader;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demo.mapper")
@ServletComponentScan
@EnableAutoConfiguration(exclude={
		JpaRepositoriesAutoConfiguration.class//禁止springboot自动加载持久化bean
})//RequestMappingHandlerMapping
public class DemoApplication extends RequestMappingHandlerMapping {

	public static void main(String[] args) {
		System.out.println("启动类的开始。。");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("启动类的结束。。");
	}
//    @Bean
//	public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet){
		//跟笔记不一样的地方，少个<DispatcherServlet>
//		ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(dispatcherServlet);
		//前段访问静态资源的时候一定要注意：1静态资源是否被拦截；2自己的地址写错；这两种情况一定要区分开。。
		//
//		servletRegistrationBean.addUrlMappings("*.do");  //启动类不拦截.do请求。
//		return servletRegistrationBean;
//	}
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
//		return builder.sources(DemoApplication.class);
//	}
}
