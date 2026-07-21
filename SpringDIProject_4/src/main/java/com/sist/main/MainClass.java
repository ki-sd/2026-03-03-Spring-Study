package com.sist.main;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sist.dao.*;
import com.sist.vo.*;
public class MainClass {
	public static void main(String[] args) {
//		String[] xml= {"application-context.xml","application-datasource.xml"};
		ApplicationContext app=new ClassPathXmlApplicationContext("application-*.xml");
		FoodDAO fdao=app.getBean("fdao",FoodDAO.class);
		List<FoodVO> fList=fdao.foodListData(1);
		GoodsDAO gdao=app.getBean("gdao",GoodsDAO.class);
		List<GoodsVO> gList=gdao.goodsListData(1);
		SeoulDAO sdao=app.getBean("sdao",SeoulDAO.class);
		List<SeoulVO> sList=sdao.seoulListData(1);
		
		System.out.println(fList);
		System.out.println(gList);
		System.out.println(sList);
	}
}
