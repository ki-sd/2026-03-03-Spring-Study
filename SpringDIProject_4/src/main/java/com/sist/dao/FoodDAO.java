package com.sist.dao;
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;

import lombok.Setter;
public class FoodDAO {
	@Setter
	private FoodMapper mapper;
	public List<FoodVO> foodListData(int start){
		return mapper.foodListData(start);
	}
}
