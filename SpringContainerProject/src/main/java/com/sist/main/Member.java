package com.sist.main;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
	private int mno;
	private String name,address,phone;
	public void init() {
		System.out.println("회원 목록");
	}
	public void destroy() {
		System.out.println("===============");
	}
	public void print() {
		System.out.println("회원번호:"+mno);
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		System.out.println("연락처:"+phone);
	}
}
