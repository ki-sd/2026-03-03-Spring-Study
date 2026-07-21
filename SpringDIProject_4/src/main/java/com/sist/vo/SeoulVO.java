package com.sist.vo;

import lombok.Data;

/*
 *    1. Container
 *         => 클래스 관리 (클래스 등록)
 *            객체 생성 === 주입 === 활용 === 소멸
 *            BeanFactory : DI / Core
 *                |
 *            ApplicationContext : DI / Core / AOP
 *                | => AnnotationConfigApplicationContext : 순수 자바 코딩
 *                         | =====> 기반 : Spring-Boot
 *            WebApplicationContext : DI / Core / AOP / MVC
 *               => DL / DI
 *               => DL : 클래스 찾기 => getBean()
 *               => DI : 값을 주입
 *    2. DI : 객체 생성에 필요한 값을 주입
 *              = settet DI : setXxx에 값을 채우는 경우 => 일반 변수값
 *              = constructor DI : 객체단위값을 채우는 경우
 *              = method DI
 *                객체생성 => init-method
 *                         => driver 등록
 *                객체소멸 => destroy-method
 *                         => 오라클 연결 종료
 *              = XML방법 / 어노테이션 사용
 *    3. AOP : 공통 모듈 => 모든 메서드에서 반복 호출이 되는 내용 모아서 자동화
 *             CallBack 함수 만들기
 *             Advice : 규칙
 *                |- JoinPoint : 시점
 *                   public String display()
 *                   {
 *                   	--------------
 *                   	try{
 *                   	}catch(Exception e)
 *                   }
 *    4. MVC
 *    5. ORM
 *    6. Transaction
 *    7. Security / WebSocket / Stormp
 */
@Data
public class SeoulVO {
	private int no;
	private String title,msg,address;
}
