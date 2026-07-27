package com.sist.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sist.mapper.FoodMapper;
import com.sist.vo.FoodVO;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {
	private final FoodMapper mapper;
	@Override
	public List<FoodVO> foodListData(int start) {
		return mapper.foodListData(start);
	}

	@Override
	public int foodTotalPage() {
		return mapper.foodTotalPage();
	}

	@Override
	public List<FoodVO> foodFindListData(Map map) {
		return mapper.foodFindListData(map);
	}

	@Override
	public int findTotalPage(Map map) {
		return mapper.findTotalPage(map);
	}

}
