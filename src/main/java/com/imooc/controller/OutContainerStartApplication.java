package com.imooc.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
/*
 *  如果需要打成war放到外部服务器使用,需要以下步骤:
 * 1、pom中排除tomcat插件
 * 2、创建继承SpringBootServletInitializer的类并重写configure方法,添加@SpringBootApplication
 * 3、最最坑的一点,第二步创建的类必须和controller放到同一个包
 */
@SpringBootApplication
public class OutContainerStartApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(OutContainerStartApplication.class);
	}

//	public static void main(String[] args) {
//		SpringApplication.run(OutContainerStartApplication.class, args);
//	}
}
