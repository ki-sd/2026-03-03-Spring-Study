package com.sist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.mapper.DataBoardMapper;
import com.sist.vo.DataBoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DataBoardServiceImpl implements DataBoardService {
	private final DataBoardMapper mapper;

	@Override
	public List<DataBoardVO> boardListData(int start) {
		return mapper.boardListData(start);
	}

	@Override
	public int boardTotalPage() {
		return mapper.boardTotalPage();
	}

	@Override
	public void boardInsert(DataBoardVO vo) {
		mapper.boardInsert(vo);
	}
}
