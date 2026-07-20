package com.sist.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
/*
 *     SpringFramework
 *         자바기반 (코틀린) => 애플리케이션 개발을 위한 기본 틀 제공
 *                                           -----
 *         핵심 : 결합성이 낮은 프로그램 개발 (유지 보수)
 *               클래스 수정 => 다른 클래스에 영향
 *               ------------------------ 방지
 *               
 *               객체 생성 / 관리 / 객체 소멸까지 담당
 *         => DI (의존성 주입 => 객체연결)
 *         => AOP (공통 기반 기능 모아서 자동처리)
 *         => MVC (웹 요청 처리)
 *         => ORM (DB연동) : MyBatis / JPA
 *         => Security (인증/인가)
 *         -------------------------------
 *         
 *         1. Spring Container
 *            ----------------
 *            1) 객체 생성 ~ 객체 소멸 (객체 생명주기 관리)
 *               A a=new A();
 *               B b=new B();
 *               ------------- 스프링에서 생성
 *               @Autowired (자동주입)
 *               A a; => 싱글턴으로 생성
 *            
 *            2) bean
 *               등록
 *               XML : <bean id="" class="" scope="singleton">
 *               Annotation : @bean
 *            
 *            3) container 종류
 *               = BeanFactory
 *                 => 기본 / DI / Core정도 지원
 *               = ApplicationContext 
 *                 => 기본 / DI / Core + AOP
 *                 
 *            BeanFactory
 *                |
 *            ApplicationContext
 *                |
 *            -----------------------------------
 *            |                                 |
 *     AnnotationConfigApplicationContext     WebApplicationContext
 *              자바 기반
 *              
 *            등록된 클래스를 모아서 관리
 *            -------------------
 *             1) 클래스 찾기 (DL)
 *                메서드 / 어노테이션 이용
 *                        | @autowired
 *                | getBean(id)
 *             2) 주입: 변수의 초기화 / 메서드 호출
 *                DI  setter/생성자   method DI => init-method / destroy-method
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Container에 등록
//		ApplicationContext app=new ClassPathXmlApplicationContext("application.xml");
//		// 클래스 메모리 할당
//		// 등록된 컨테이너에서 클래스 객체 읽기
//		Sawon sa=(Sawon)app.getBean("sa");
//		sa.print();
//		Sawon sa1=(Sawon)app.getBean("sa1");
//		sa1.print();
//		Sawon sa2=(Sawon)app.getBean("sa2");
//		sa2.print();
//		Sawon sa3=new Sawon();
//		sa3.print();
		GenericApplicationContext app=new GenericXmlApplicationContext("application1.xml");
		Member mem=(Member)app.getBean("mem");
		Member mem1=(Member)app.getBean("mem1");
		Member mem2=app.getBean("mem2",Member.class);
		Member mem3=app.getBean("mem3",Member.class);
		mem.print();
		app.close();
		
//		System.out.println("-------------------");
//		mem1.print();
//		System.out.println("-------------------");
//		mem2.print();
//		System.out.println("-------------------");
//		mem3.print();
		
		/*
		 *    클래스 관리 영역 : 컨테이너
		 *    ----------- XML을 파싱 => 클래스 저장
		 *    | 클래스 메모리 할당
		 *    | Map에 저장
		 *      -----------------------> init-method
		 *    | 활용 =====> 개발자 사용
		 *    | 소멸
		 *      -----------------------> destroy-method
		 *    컨테이너 클래스
		 *       BeanFactory
		 *           |
		 *       ApplicationContext
		 *           |--- GenericApplicationContext : 소멸 기능
		 *           |--- AnnotationConfigApplicationContext : 일반 자바로 구현
		 *       WebApplicationContext : MVC
		 *       
		 *       클래스 => 객체 생성
		 *            | => 초기값이 필요할 때가 있다
		 *                 setter DI => setxxx()를 이용
		 *                 constructor DI => 생성자
		 *                 method DI => driver 등록 / DB닫기
		 *                              크롤링
		 *                              init-method : 드라이버 설정
		 *                              destroy-method : 드라이버 닫기
		 *                 -------------------------------
		 *                 
		 *                 스프링을 통해 필요한 값을 주입
		 *       
		 *       DI     /    AOP    /    MVC    /    ORM
		 *       --- 75%     --- 5%
		 */
	}

}
