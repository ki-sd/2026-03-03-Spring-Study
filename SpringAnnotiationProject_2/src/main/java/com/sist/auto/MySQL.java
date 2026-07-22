package com.sist.auto;

import org.springframework.stereotype.Repository;

@Repository
public class MySQL implements DB{

	@Override
	public void Connection() {
		// TODO Auto-generated method stub
		System.out.println("MySQL 연결");
	}

	@Override
	public void disConnection() {
		// TODO Auto-generated method stub
		System.out.println("MySQL 연결 해제");
	}

}
