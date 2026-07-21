package com.sist.main2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(SawonConfig.class);
		Sawon s=(Sawon)app.getBean("sa");
		System.out.println(s.getSabun());
		System.out.println(s.getName());
		System.out.println(s.getDept());
		System.out.println(s.getLoc());
		app.close();
	}
}
