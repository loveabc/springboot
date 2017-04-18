package com.imooc.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/*
 * 这是一个spring boot模板,
 * 可直接main方法启动,也可达成jar包,使用java -java **.jar启动
 * 可打成war包,放到tomcat中启动,如果需要放到其他容器启动,估计需要修改build中的plugin
 * 
 */
@SpringBootApplication
public class StartApp extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(StartApp.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(StartApp.class);
	}
	
}
