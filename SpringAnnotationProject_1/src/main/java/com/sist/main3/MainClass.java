package com.sist.main3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	AnnotationConfigApplicationContext app=new AnnotationConfigApplicationContext(DAOConfig.class);
	MyDAO dao=(MyDAO)app.getBean("MyDAO");
	
}
