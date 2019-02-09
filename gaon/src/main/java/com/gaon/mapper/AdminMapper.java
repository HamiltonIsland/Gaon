package com.gaon.mapper;

import java.util.HashMap;
import java.util.List;

import com.gaon.vo.AttendVo;
import com.gaon.vo.CourseVO;

public interface AdminMapper {

	List<CourseVO> selectConsultList(int academyNo);

	int selectAttendList(HashMap<String, Object> params);

//	List<Integer> AttendAvg(HashMap<String, Object> params);
	
	int AttendAvg(HashMap<String, Object> params);


}
