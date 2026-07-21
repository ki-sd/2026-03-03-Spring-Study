package com.sist.dao;
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.*;

import lombok.Setter;

public class SeoulDAO {
	@Setter
	private SeoulMapper mapper;
	public List<SeoulVO> seoulListData(int start){
		return mapper.seoulListData(start);
	}
}
