package com.sist.main;
import java.lang.reflect.Method;
import java.util.*;

import org.apache.commons.collections.map.HashedMap;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import lombok.Getter;
/*
 * 		XML 파싱
 *       DOM / SAX
 *              | 스프링/마이바티스
 *              | XML코드를 한줄씩 읽어서 필요데이터 추출
 *              
 *              
 *       <?xml version="1.0" encoding="UTF-8"?>
		<beans>
			<bean id="sa" class="com.sist.main.Sawon"
			p:sabun="1"
			p:name="홍길동"
			p:dept="개발부"
			p:job="사원"
			/>
		</beans>
 */
public class XMLParse extends DefaultHandler {
	@Getter
	private Map map=new HashedMap();

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		try {
			if(qName.equals("bean")) {
				String id=attributes.getValue("id");
				String cls=attributes.getValue("class");
				String sabun=attributes.getValue("p:sabun");
				String name=attributes.getValue("p:name");
				String dept=attributes.getValue("p:dept");
				String job=attributes.getValue("p:job");
//				System.out.println(id+" "+cls+" "+name+" "+dept+" "+job+" "+sabun);
				String[] aName= {sabun,name,dept,job};
				String[] ss= {
						attributes.getQName(2),
						attributes.getQName(3),
						attributes.getQName(4),
						attributes.getQName(5)
				};
//				System.out.println(Arrays.toString(ss));
				
				// DI class 메모리 할당
				Class clsName=Class.forName(cls);
				// 리플렉션 => 클래스 이름으로 메모리 할당 / 생성자 제어 / 멤버면수 제어 / 메서드 제어
				Object obj=clsName.getDeclaredConstructor().newInstance();
				Method[] methods=clsName.getDeclaredMethods();
				for(Method m:methods) {
//					System.out.println(m.getName());
					String mName=m.getName();
					// 메서드명 찾기 => setter
					for(int i=0;i<ss.length;i++) {
						if(mName.equalsIgnoreCase("set"+ss[i].substring(ss[i].indexOf(":")+1))) {
							if(i==0) {
								m.invoke(obj, Integer.parseInt(aName[i]));
							}else {
								m.invoke(obj, aName[i]);
							}
						}
					}
				}
				map.put(id, obj);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
