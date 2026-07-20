# <img src="https://flagcdn.com/w20/kr.png" width="20" style="vertical-align: middle;"> JAVA AWS CI/CD 풀스택과정 - SpringFramework<br>
### <img src="https://flagcdn.com/w20/us.png" width="20" style="vertical-align: middle;"> JAVA AWS CI/CD Full-stack Course - SpringFramework<br>
### <img src="https://flagcdn.com/w20/jp.png" width="20" style="vertical-align: middle;"> JAVA AWS CI/CD フルスタック課程 - SpringFramework<br>

<br>
<br>

* **Progress** 
	<p>
		<img src="https://img.shields.io/badge/Progress-0%25-red?style=flat-square" align="absmiddle">
* **Language & Markup** 
	<p>
		<img src="https://img.shields.io/badge/Java_11-ED8B00?style=flat-square&logo=openjdk&logoColor=white" align="absmiddle"> 
		<img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white" align="absmiddle"> 
		<img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white" align="absmiddle">
* **Framework & Library** 
	<p>
		<img src="https://img.shields.io/badge/Spring_Framework-6DB33F?style=flat-square&logo=spring&logoColor=white" style="vertical-align: middle;"> 
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
| **07-20** | <ul><li><img src="https://flagcdn.com/w20/kr.png" width="20"> <strong>[Setter 및 생성자 기반 DI 구현]</strong> `application.xml`에서 `<property>`와 `p:` 네임스페이스를 활용한 Setter DI를 구현함. 또한, `application1.xml`에서는 `<constructor-arg>`와 `c:` 네임스페이스를 활용하여 객체 생성 시점에 의존성을 강제하는 Constructor DI를 체화함.<br><strong>[Bean 생명주기(Lifecycle) 제어]</strong> `Member` 클래스에 `init()`과 `destroy()` 메서드를 정의하고, XML에 `init-method` 및 `destroy-method` 속성으로 바인딩함. `GenericApplicationContext`의 `close()`를 명시적으로 호출하여 컨테이너 소멸 프로세스를 완벽하게 제어함.</li><li><img src="https://flagcdn.com/w20/us.png" width="20"> <strong>[Setter & Constructor DI Implementation]</strong> Implemented Setter Dependency Injection using `<property>` tags and the `p:` namespace in `application.xml`. Additionally, enforced dependency requirements at instantiation via Constructor DI using `<constructor-arg>` and the `c:` namespace in `application1.xml`.<br><strong>[Bean Lifecycle Management]</strong> Defined `init()` and `destroy()` methods within the `Member` class and mapped them using XML attributes. Successfully orchestrated the bean destruction phase by explicitly invoking `close()` on the `GenericApplicationContext`.</li><li><img src="https://flagcdn.com/w20/jp.png" width="20"> <strong>[SetterおよびコンストラクタDIの実装]</strong> `application.xml`にて`<property>`と`p:`名前空間を活用したSetter DIを実装した。また、`application1.xml`では`<constructor-arg>`と`c:`名前空間を利用し、オブジェクト生成時に依存性を強制するコンストラクタDIを体得した。<br><strong>[Beanライフサイクル制御]</strong> `Member`クラスに`init()`および`destroy()`メソッドを定義し、XML属性としてバインディングした。`GenericApplicationContext`の`close()`を明示的に呼び出すことで、コンテナの消滅プロセスを完全に制御した。</li></ul> |