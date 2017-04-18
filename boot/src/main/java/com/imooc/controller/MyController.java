package com.imooc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// 使用@Value获取配置文件的值
	@Value("${mysql.jdbc.url}")
	private String url;
	@Value("${mysql.jdbc.username}")
	private String username;
	@Value("${mysql.jdbc.password}")
	private String password;

	@Autowired
	private Environment env;

	@GetMapping(value = "/hello")
	public String hello() {
		return url + " " + username + " " + password + "<br/>"
				+ env.getProperty("mysql.jdbc.url") + "  "
				+ env.getProperty("mysql.jdbc.username") + "  "
				+ env.getProperty("mysql.jdbc.password");

	}
}
