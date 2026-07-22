package com.sist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sist.dao.DeptDAO;
import com.sist.dao.EmpDAO;
import com.sist.vo.DeptVO;
import com.sist.vo.EmpVO;

// 비즈니스 로직 처리
// 로그인/보안 (암호화,복호화) / 문자열 결합 ..... 외부에서 데이터 읽기
// => 채팅, 실시간 전송
/*
 *    스테레오 타입
 *    ----------> 클래스 메모리 할당 요청
 *                1) @Component : 일반 클래스 => ChatManager,NewsManager,MainClass...
 *                2) @Repository : DAO => DB연동
 *                3) @Service : DAO+DAO => 기능
 *                4) => web @Controller / @RestController
 *                          @ControllerAdvice
 */
@Service("eService")
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDAO eDao;
	@Autowired
	private DeptDAO dDao;
	@Override
	public List<EmpVO> empListData() {
		// TODO Auto-generated method stub
		return eDao.empListData();
	}
	@Override
	public List<DeptVO> deptListData() {
		// TODO Auto-generated method stub
		return dDao.deptListData();
	}
	
}
