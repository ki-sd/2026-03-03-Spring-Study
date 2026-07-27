package com.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
