package com.imooc;

import com.imooc.service.WelcomeService;
import org.springframework.context.support.FileSystemXmlApplicationContext;
//P2-3 第一节课，基础入门
public class Entrance {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String xmlPath = "C:\\CH\\JavaEE\\Wheel\\spring-framework-5.2.0.RELEASE\\springdemo\\src\\main\\resources\\spring\\spring-config.xml";
		FileSystemXmlApplicationContext applicationContext = new FileSystemXmlApplicationContext(xmlPath);
		WelcomeService welcomeService = (WelcomeService) applicationContext.getBean("welcomeService");
		welcomeService.sayHello("小李子");
	}
}
