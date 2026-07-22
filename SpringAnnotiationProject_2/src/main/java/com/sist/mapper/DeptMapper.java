package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.DeptVO;
public interface DeptMapper {
	@Select("SELECT deptno,dname,loc "
			+ "FROM dept")
	public List<DeptVO> deptListData();
	/*
	 *   SELECT ~
	 *   FROM ~
	 *   WHERE cno=#{cno} AND no=#{no}
	 *   
	 *   display(int cno,int no) => 오류
	 *   display(@param("cno") int cno,@param("no") int no)
	 */
}
