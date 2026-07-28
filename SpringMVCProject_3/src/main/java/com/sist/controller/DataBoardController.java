package com.sist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.*;
import com.sist.service.DataBoardService;
import com.sist.vo.DataBoardVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class DataBoardController {
	private final DataBoardService service;
	
	@GetMapping("databoard/list.do")
	public String databoard_list(String page,Model model) {
		if(page==null) page="1";
		int curpage=Integer.parseInt(page);
		int start=(curpage*10)-10;
		List<DataBoardVO> list=service.boardListData(start);
		int totalpage=service.boardTotalPage();
		model.addAttribute("list", list);
		model.addAttribute("curpage", curpage);
		model.addAttribute("totalpage", totalpage);
		model.addAttribute("main_jsp", "../databoard/list.jsp");
		return "main/main";
	}
	@GetMapping("databoard/insert.do")
	public String databoard_insert(Model model) {
		model.addAttribute("main_jsp", "../databoard/insert.jsp");
		return "main/main";
	}
	@PostMapping("databoard/insert_ok.do")
	public String databoard_insert_ok(DataBoardVO vo) {
		// => Command 객체 => DataBoardVO vo
		String path="c:\\upload";
		List<MultipartFile> list=vo.getFiles();
		if(list==null) {
			vo.setFilename("");
			vo.setFilesize("");
			vo.setFilecount(0);
		}else {
			try {
				String filename="";
				String filesize="";
				for(MultipartFile mf:list) {
					String oname=mf.getOriginalFilename();
					File file=new File(path+"\\"+oname);
					if(file.exists()) {
						String name=oname.substring(0,oname.lastIndexOf("."));
						String ext=oname.substring(oname.lastIndexOf("."));
						int count=1;
						while(file.exists()) {
							String newName=name+"("+count+")"+ext;
							file=new File(path+"\\"+newName);
							count++;
						}
					}
					mf.transferTo(file); //업로드
					filename+=file.getName()+",";
					filesize+=file.length()+",";
				}
				filename=filename.substring(0,filename.lastIndexOf(","));
				filesize=filesize.substring(0,filesize.lastIndexOf(","));
				vo.setFilename(filename);
				vo.setFilesize(filesize);
				vo.setFilecount(list.size());
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		service.boardInsert(vo);
		return "redirect:list.do";
	}
}
