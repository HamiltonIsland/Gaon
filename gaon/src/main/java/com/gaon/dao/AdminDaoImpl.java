package com.gaon.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.gaon.mapper.AdminMapper;
import com.gaon.vo.CourseVO;

@Repository("adminDao")
public class AdminDaoImpl implements AdminDao {
	
	@Autowired
	@Qualifier("adminMapper")
	private AdminMapper adminMapper;

	@Override
	public List<CourseVO> selectConsultList(int academyNo) {
		
		List<CourseVO> coureses = adminMapper.selectConsultList(academyNo);
		
		return coureses;
	}

	@Override
	public List<Integer> selectAttendList(int studentNo, int courseNo) {
		
		HashMap<String,Object> params=new HashMap<>();
		params.put("studentNo",studentNo);
		params.put("courseNo",courseNo);
	
		List<Integer> average = new ArrayList<Integer>();
//		
//		try {
//			average = adminMapper.AttendAvg(params);
//		} catch (Exception e) {
//			
//		}
		
		for(int i = 0;i<12;i++) {
			params.put("month",i+1);
			System.out.println(params);
			try {
				average.add(adminMapper.AttendAvg(params));
			} catch (Exception e) {
				average.add(0);
			}
			
			
		}
		
		System.out.println(average);
		
		return average;
	}




}
