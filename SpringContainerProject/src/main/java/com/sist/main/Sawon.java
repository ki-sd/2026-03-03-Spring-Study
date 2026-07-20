package com.sist.main;

import lombok.Data;

@Data
public class Sawon {
	private int sabun,pay;
	private String name,dept,job;
	
	public void print() {
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
		System.out.println("직위:"+job);
		System.out.println("급여:"+pay);
	}
}
