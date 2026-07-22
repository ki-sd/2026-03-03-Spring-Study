package com.sist.aop;

import java.util.*;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.sist.vo.*;

// 공통 사용 클래스
@Aspect
@Component
/*
 *    JoinPoint => 시점 (어디서 호출)
 *      @Before
 *      @After
 *      @After-Returning
 *      @Around
 *      @After-Throwing
 *    PointCut => 어떤 메서드에 적용
 *    ------------Advice
 *    
 *    public void display(){
 *    	@Before
 *    	try{
 *    		-----------------@Around => before
 *  		  => setAutoCommit(false)
 *  		  => commit()
 *            => 어떤 메서드 호출 => 시작
 *            => 종료 == log
 *       	-----------------@Around => After	
 *    	}catch(Exception e){
 *    		-----------------@After-Throwing		
 *    	}finally{
 *    		-----------------@After 
 *    	}
 *    	return "값" --- ------@After-Returning
 *    }
 *    
 *    * com.sist.service.EmpServiceImpl.*(..)
 *    -리턴형               클래스           메서드 매개변수
 *    |*:모든 리턴형							|*:모든 메서드
 */
public class EmpAOP {
	@Before("execution(* com.sist.service.EmpServiceImpl.*(..))")
	public void before() {
		System.out.println("메서드 진입 전");
	}
	@After("execution(* com.sist.service.EmpServiceImpl.*(..))")
	public void after() {
		System.out.println("메서드 진입 종료");
	}
	@Around("execution(* com.sist.service.EmpServiceImpl.*(..))")
	public Object around(ProceedingJoinPoint jp) throws Throwable {
		Object obj=null;
		long start=System.currentTimeMillis();
		System.out.println("호출된 메서드:"+jp.getSignature().getName());
		// 메서드 호출
		obj=jp.proceed();
		long end=System.currentTimeMillis();
		System.out.println("걸린시간:"+(end-start)+"ms");
		return obj;
	}
	@AfterReturning(value="execution(* com.sist.service.EmpServiceImpl.*(..))",returning="obj")
	public void afterRetrun(Object obj) {
		if(obj instanceof List<?>) {
			List<?> list=(List<?>)obj;
			for(Object item:list) {
				if(item instanceof EmpVO) {
					EmpVO vo=(EmpVO)item;
					System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getDbday());
				}
				if(item instanceof DeptVO) {
					DeptVO vo=(DeptVO)item;
					System.out.println(vo.getDeptno()+" "+vo.getDname()+" "+vo.getLoc());
				}
			}
		}
	}
	@AfterThrowing(value="execution(* com.sist.service.EmpServiceImpl.*(..))",throwing="ex")
	public void afterThrowing(Throwable ex) {
		ex.printStackTrace();
	}
}
