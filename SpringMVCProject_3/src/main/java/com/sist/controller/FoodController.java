package com.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.vo.*;
import java.util.*;
import com.sist.service.FoodService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FoodController {
	private final FoodService service;
	@GetMapping("main/main.do")
	public String main_main(String page,Model model) {
		if(page==null) page="1";
		int curpage=Integer.parseInt(page);
		int start=(curpage*12)-12;
		List<FoodVO> list=service.foodListData(start);
		int totalpage=service.foodTotalPage();
		final int BLOCK=10;
		int startPage=((curpage-1)/BLOCK*BLOCK)+1;
		int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;
		if(endPage>totalpage) endPage=totalpage;
		model.addAttribute("curpage", curpage);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("list", list);
		// request(ip포함) => 가급적 request 사용 지양
		model.addAttribute("main_jsp", "../main/home.jsp");
		return "main/main";
	}
	/*
	 *      PostMapping / GetMapping
	 *          |              |
	 *        <form>           <a>,sendRedirect(),location.href()
	 *        ajax({
	 *           type:'post'
	 *        })
	 *        axios.post()
	 *        
	 *        
	 *     PutMapping / DeleteMapping ==> RestAPI
	 *       => 다른 프로그램과 연동
	 *       => JavaScript : React / Vue
	 *       
	 *     GetMapping : Select  axios.get()
	 *     PostMapping : Insert axios.post()
	 *     PutMapping : Update  axios.put()
	 *     DeleteMapping : Delete axios.delete()
	 *     
	 *     => request를 사용하지 않음
	 *        ==> 매개변수를 시용해서 =>  DispatcherServlet으로부터 값을 받음
	 *        ==> 순서 상관X / 키명과 동일한 변수
	 *        ==> 애매한 데이터 / null이 있을수 있는경우 String으로
	 *        ==> 데이터 전송시에는 Model을 이용
	 *                        ------- 데이터 전송 객체
	 *     => @Controller : Router(화면이동)
	 *        -----------
	 *        return형
	 *        | = String => 화면이동 (JSP지정)
	 *        | = void  => 파일다운로드 (화면이동X)
	 *     
	 *     => 매개변수
	 *        일반 데이터형 , 내장 객체 , 데이터를 모아서 받을 수 있다
	 *        -----------------------------------------
	 *        display(HttpSession session)
	 *        display(String[] hobby)
	 *        display(List list)
	 *          => <input type="text" name="list[0]">
	 *             <input type="text" name="list[1]">
	 *             <input type="text" name="list[2]">
	 *          
	 *          => (RedirectAttribute a)
	 *             a.setAttribute("no",1)
	 *             return "redirect:../food/detail.do"
	 *             
	 *        최근 유행
	 *           1. SpringBoot + Vue
	 *           2. SpringBoot + React
	 *           3. FastAPI + Vue, React
	 *           4. NodeJS + Vue, React
	 *           
	 *        요청 = Controller = Mapper = Repository = Service = Controller = JSP
	 */
	@GetMapping("food/detail.do")
	public String food_detail(int no,Model model) {
		FoodVO vo=service.foodDetailData(no);
		model.addAttribute("vo", vo);
		model.addAttribute("main_jsp", "../food/detail.jsp");
		return "main/main";
	}
	@RequestMapping("food/find.do")
	public String food_find(String page,String column,String fd,Model model) {
		Map<String,Object> map=new HashMap<String, Object>();
		if(page==null) page="1";
		int curpage=Integer.parseInt(page);
		if(column==null) column="address";
		if(fd==null) fd="마포";
		int start=(curpage*12)-12;
		map.put("start", start);
		map.put("column", column);
		map.put("fd", fd);
		List<FoodVO> list=service.foodFindListData(map);
		int totalpage=service.findTotalPage(map);
		
		final int BLOCK=10;
		int startPage=((curpage-1)/BLOCK*BLOCK)+1;
		int endPage=((curpage-1)/BLOCK*BLOCK)+BLOCK;
		if(endPage>totalpage) endPage=totalpage;
		
		model.addAttribute("list", list);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("curpage",curpage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("column",column);
		model.addAttribute("fd", fd);
		model.addAttribute("main_jsp", "../food/find.jsp");
		return "main/main";
	}
}
