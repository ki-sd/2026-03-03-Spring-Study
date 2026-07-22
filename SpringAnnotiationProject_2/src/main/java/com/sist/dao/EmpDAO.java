package com.sist.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.mapper.EmpMapper;
import com.sist.vo.EmpVO;

@Repository
public class EmpDAO {
	//Mapper 읽기
	@Autowired // 스프링에서 자동화 => 구현된 클래스 주소를 넘겨줌
	//단점 => OOP가 깨짐
	private EmpMapper mapper;
	
	public List<EmpVO> empListData(){
		return mapper.empListData();
	}
}
