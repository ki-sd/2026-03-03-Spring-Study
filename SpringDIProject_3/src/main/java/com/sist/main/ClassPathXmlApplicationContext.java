package com.sist.main;
import java.util.*;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.commons.collections.map.HashedMap;

import java.io.*;
public class ClassPathXmlApplicationContext implements ApplicationContext {
	private Map clsMap=new HashedMap();
	public ClassPathXmlApplicationContext(String path) {
		try {
			SAXParserFactory spf=SAXParserFactory.newInstance();
			SAXParser sp=spf.newSAXParser();
			XMLParse xp=new XMLParse();
			sp.parse(new File(path), xp);
			clsMap=xp.getMap();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public Object getBean(String key) {
		return clsMap.get(key);
	}
	
}
