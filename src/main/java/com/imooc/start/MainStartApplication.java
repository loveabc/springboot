package com.imooc.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/*
 * 使用main方法启动spring boot,(web server使用的是tomcat)
 * 注意:
 * 1、main方法所在类需要添加注解 @EnableAutoConfiguration
 * 2、main方法所在类需要添加注解 @ComponentScan指示spring管理的所有类
 * 
 *
 */
@ComponentScan({"com.imooc.controller"})
@EnableAutoConfiguration
public class MainStartApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MainStartApplication.class, args);
	}
	
}
