package com.sist.service;

import java.util.List;

import com.sist.vo.DataBoardVO;

public interface DataBoardService {
	public List<DataBoardVO> boardListData(int start);
	public int boardTotalPage();
	public void boardInsert(DataBoardVO vo);
}
