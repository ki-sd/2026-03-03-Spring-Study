package com.sist.dao;
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;

import lombok.Setter;

public class GoodsDAO {
	@Setter
	private GoodsMapper mapper;
	public List<GoodsVO> goodsListData(int start){
		return mapper.goodsListData(start);
	}
}
