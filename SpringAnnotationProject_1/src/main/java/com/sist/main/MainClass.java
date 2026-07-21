package com.sist.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("app.xml");
		Member m=app.getBean("mem",Member.class);
		System.out.println(m);
		Sawon s=app.getBean("sawon",Sawon.class);
		System.out.println(s);
		Student st=app.getBean("student",Student.class);
		System.out.println(st);
	}
}
