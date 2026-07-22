# <img src="https://flagcdn.com/w20/kr.png" width="20" style="vertical-align: middle;"> JAVA AWS CI/CD 풀스택과정 - SpringFramework<br>
### <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> JAVA AWS CI/CD Full-stack Course - SpringFramework<br>
### <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> JAVA AWS CI/CD フルスタック課程 - SpringFramework<br>

<br>
<br>

* **Progress** 
	<p>
		<img src="https://img.shields.io/badge/Progress-10%25-red?style=flat-square" align="absmiddle">
* **Language & Markup** 
	<p>
		<img src="https://img.shields.io/badge/Java_11-ED8B00?style=flat-square&logo=openjdk&logoColor=white" align="absmiddle"> 
		<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white" align="absmiddle"> 
		<img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white" align="absmiddle">
* **Framework & Library** 
	<p>
		<img src="https://img.shields.io/badge/Spring_Framework-6DB33F?style=flat-square&logo=spring&logoColor=white" align="absmiddle"> 
		<img src="https://img.shields.io/badge/Vue.js-4FC08D?style=flat-square&logo=vuedotjs&logoColor=white" align="absmiddle"> 
		<img src="https://img.shields.io/badge/jQuery-0769AD?style=flat-square&logo=jquery&logoColor=white" align="absmiddle">
* **Network & API** 
	<p>
		<img src="https://img.shields.io/badge/Axios-5A29E4?style=flat-square&logo=axios&logoColor=white" align="absmiddle">
* **DataBase** 
	<p>
		<img src="https://img.shields.io/badge/Oracle_21c-F80000?style=flat-square&logo=oracle&logoColor=white" align="absmiddle">
* **Server** 
	<p>
		<img src="https://img.shields.io/badge/Apache_Tomcat-F8DC75?style=flat-square&logo=apachetomcat&logoColor=black" align="absmiddle">
* **IDE & Tools** 
	<p>
		<img src="https://img.shields.io/badge/Eclipse-2C2255?style=flat-square&logo=eclipseide&logoColor=white" align="absmiddle"> 
		<img src="https://img.shields.io/badge/VS_Code-007ACC?style=flat-square&logo=visualstudiocode&logoColor=white" align="absmiddle"> 
		<img src="https://img.shields.io/badge/SQL_Developer-F80000?style=flat-square&logo=oracle&logoColor=white" align="absmiddle"> 
		<img src="https://img.shields.io/badge/DBeaver-382923?style=flat-square&logo=dbeaver&logoColor=white" align="absmiddle">

<br>
<br>

📅 학습 일지 (Study Log / 学習記録)
------------------------------

<br>
자세한 내용: <a href="https://ki-sd.tistory.com/category/SpringStudy" target="_blank"><img src="https://img.shields.io/badge/Tistory-000000?style=flat-square&logo=tistory&logoColor=white&link=https://ki-sd.tistory.com/"></a>
<br>

#### 2026-07
| 날짜 | 학습 내용 (KR / US / JP) |
| :--- | :--- |
| **07-20** | <ul><li><img src="https://flagcdn.com/w20/kr.png" width="20"> <strong>[Setter 및 생성자 기반 DI 구현]</strong> `application.xml`에서 `<property>`와 `p:` 네임스페이스를 활용한 Setter DI를 구현함. 또한, `application1.xml`에서는 `<constructor-arg>`와 `c:` 네임스페이스를 활용하여 객체 생성 시점에 의존성을 강제하는 Constructor DI를 체화함.<br><strong>[Bean 생명주기(Lifecycle) 제어]</strong> `Member` 클래스에 `init()`과 `destroy()` 메서드를 정의하고, XML에 `init-method` 및 `destroy-method` 속성으로 바인딩함. `GenericApplicationContext`의 `close()`를 명시적으로 호출하여 컨테이너 소멸 프로세스를 제어함.</li><li><img src="https://flagcdn.com/w20/us.png" width="20"> <strong>[Setter & Constructor DI Implementation]</strong> Implemented Setter Dependency Injection using `<property>` tags and the `p:` namespace in `application.xml`. Additionally, enforced dependency requirements at instantiation via Constructor DI using `<constructor-arg>` and the `c:` namespace in `application1.xml`.<br><strong>[Bean Lifecycle Management]</strong> Defined `init()` and `destroy()` methods within the `Member` class and mapped them using XML attributes. Successfully orchestrated the bean destruction phase by explicitly invoking `close()` on the `GenericApplicationContext`.</li><li><img src="https://flagcdn.com/w20/jp.png" width="20"> <strong>[SetterおよびコンストラクタDIの実装]</strong> `application.xml`にて`<property>`と`p:`名前空間を活用したSetter DIを実装した。また、`application1.xml`では`<constructor-arg>`と`c:`名前空間を利用し、オブジェクト生成時に依存性を強制するコンストラクタDIを体得した。<br><strong>[Beanライフサイクル制御]</strong> `Member`クラスに`init()`および`destroy()`メソッドを定義し、XML属性としてバインディングした。`GenericApplicationContext`の`close()`を明示的に呼び出すことで、コンテナの消滅プロセスを完全に制御した。</li></ul> |
| **07-21** | <ul><li><img src="https://flagcdn.com/w20/kr.png" width="20"> <strong>[Pure Java 기반 DI 컨테이너 전환]</strong> XML 방식의 빈(Bean) 설정을 대체하여, `@Configuration`과 `@Bean` 어노테이션을 활용한 자바 기반의 설정 클래스(`SawonConfig`)를 도입함. `AnnotationConfigApplicationContext`를 통해 객체의 생명주기를 제어함. <br><strong>[AOP 관점 지향 프로그래밍 적용]</strong> 핵심 비즈니스 로직에서 발생하는 오라클 연결 및 해제 코드를 분리함. `@Aspect`와 `@Before`, `@After` 어노테이션을 활용해 횡단 관심사(Cross-cutting Concerns)를 `DAOAspect` 클래스로 모듈화함. <br><strong>[프록시(Proxy) 디자인 패턴 구현]</strong> 스프링 AOP의 기저 기술인 프록시 패턴을 `Proxy.java`로 직접 구현함. 타겟 객체(`MyDAO`)를 감싸 실행 전후로 부가 기능을 동적으로 주입하는 런타임 위임(Delegation) 구조를 확인함[cite: 29, 31].</li><li><img src="https://flagcdn.com/w20/us.png" width="20"> <strong>[Pure Java DI Container Transition]</strong> Replaced XML-based bean configurations with Java-based configuration classes (`SawonConfig`) using `@Configuration` and `@Bean` annotations[cite: 24]. Managed bean lifecycles via `AnnotationConfigApplicationContext`[cite: 22]. <br><strong>[AOP Implementation]</strong> Separated database connection management from core business logic[cite: 27]. Modularized cross-cutting concerns into `DAOAspect` using AspectJ annotations (`@Aspect`, `@Before`, `@After`)[cite: 25]. <br><strong>[Proxy Design Pattern Application]</strong> Manually implemented the Proxy pattern (`Proxy.java`) to understand the underlying mechanics of Spring AOP[cite: 31]. Verified the dynamic runtime delegation structure by wrapping the target object (`MyDAO`) to inject pre- and post-processing logic[cite: 29, 31].</li><li><img src="https://flagcdn.com/w20/jp.png" width="20"> <strong>[Pure Java基盤DIコンテナへの移行]</strong> XMLベースのBean設定を代替し、`@Configuration`と`@Bean`アノテーションを活用したJavaベースの設定クラス（`SawonConfig`）を導入[cite: 24]。`AnnotationConfigApplicationContext`を通じてオブジェクトのライフサイクルを制御[cite: 22]。<br><strong>[AOP(アスペクト指向プログラミング)の適用]</strong> コアビジネスロジックからOracle接続・解除コードを分離[cite: 27]。`@Aspect`と`@Before`、`@After`アノテーションを活用し、横断的関心事(Cross-cutting Concerns)を`DAOAspect`クラスにモジュール化[cite: 25]。<br><strong>[プロキシ(Proxy)デザインパターンの実装]</strong> スプリングAOPの基礎技術であるプロキシパターンを`Proxy.java`として直接実装[cite: 31]。ターゲットオブジェクト(`MyDAO`)をラップし、実行前後に付加機能を動的に注入するランタイム委譲(Delegation)構造を確認[cite: 29, 31]。</li></ul> |
| **07-22** | <ul><li><img src="https://flagcdn.com/w20/kr.png" width="20"> <strong>[Service 계층 도입]</strong> `@Service` 어노테이션을 활용하여 비즈니스 로직을 처리하는 `EmpServiceImpl`을 구현함. 여러 DAO(`EmpDAO`, `DeptDAO`)를 의존성 주입(`@Autowired`)받아 기능을 통합 관리함. <br><strong>[Spring 및 MyBatis 통합 설정]</strong> `app.xml`에 `BasicDataSource`, MyBatis `SqlSessionFactoryBean`, `<mybatis-spring:scan>` 설정을 구성하여 Oracle DB 및 Mapper 인터페이스 연동 환경을 구축함. <br><strong>[Spring MVC Controller 구현]</strong> `@Controller`를 사용해 웹 요청을 처리하는 `MainController`를 작성함. `@GetMapping`과 `@PostMapping`으로 요청 방식을 분리하고, 커맨드 객체(`BoardVO`)와 `Model`을 활용한 데이터 바인딩 방식을 확인함[cite: 30, 31].</li><li><img src="https://flagcdn.com/w20/us.png" width="20"> <strong>[Service Layer Implementation]</strong> Implemented `EmpServiceImpl` using the `@Service` annotation to handle business logic[cite: 28]. Integrated multiple DAOs (`EmpDAO`, `DeptDAO`) via dependency injection (`@Autowired`)[cite: 28]. <br><strong>[Spring & MyBatis Integration]</strong> Configured `BasicDataSource`, MyBatis `SqlSessionFactoryBean`, and `<mybatis-spring:scan>` in `app.xml` to establish Oracle DB and Mapper interface connections. <br><strong>[Spring MVC Controller]</strong> Created `MainController` using `@Controller` to handle web requests. Separated request methods using `@GetMapping` and `@PostMapping`, and verified data binding mechanisms using command objects (`BoardVO`) and the `Model` interface[cite: 30, 31].</li><li><img src="https://flagcdn.com/w20/jp.png" width="20"> <strong>[Service階層の導入]</strong> `@Service`アノテーションを活用し、ビジネスロジックを処理する`EmpServiceImpl`を実装[cite: 28]。複数のDAO(`EmpDAO`、`DeptDAO`)を依存性注入(`@Autowired`)して機能を統合管理[cite: 28]。<br><strong>[SpringおよびMyBatis統合設定]</strong> `app.xml`に`BasicDataSource`、MyBatis `SqlSessionFactoryBean`、`<mybatis-spring:scan>`設定を構成し、Oracle DBとMapperインターフェースの連動環境を構築。<br><strong>[Spring MVC Controllerの実装]</strong> `@Controller`を使用してWebリクエストを処理する`MainController`を作成[cite: 30]。`@GetMapping`と`@PostMapping`でリクエストメソッドを分離し、コマンドオブジェクト(`BoardVO`)と`Model`を活用したデータバインディング方式を確認[cite: 30, 31]。</li></ul> |