package com.gaon.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gaon.service.AdminService;
import com.gaon.vo.AttendVo;
import com.gaon.vo.CourseVO;
@Controller
@RequestMapping("/admin/")
public class AdminController {
	
	@Autowired
	@Qualifier("adminService")
	private AdminService adminService;

	@RequestMapping(value="gradeList.action",method = RequestMethod.GET)
	public String gradeList(HttpSession session, int academyNo, Model model) {
		if(session.getAttribute("login")==null) {
			return "redirect:/home.action";
		}
		
		List<CourseVO> courses = adminService.ConsultList(academyNo);
		model.addAttribute("courses",courses);

		return "consult/consultList";
		
	}
	
	@RequestMapping(value="coursesList.action",method = RequestMethod.GET)
	public String consultList(int academyNo, Model model,HttpSession session,String type) {
		if(session.getAttribute("login")==null) {
			return "redirect:/home.action";
		}
		List<CourseVO> courses = adminService.ConsultList(academyNo);
		model.addAttribute("courses",courses);
		model.addAttribute("type",type);
		return "consult/consultList";
	}
	
	@RequestMapping(value="studentAttendList.action")
	public String studentList(int studentNo,int courseNo, Model model,HttpSession session) {
		if(session.getAttribute("login")==null) {
			return "redirect:/home.action";
		}
		List<Integer> averages = adminService.attendList(studentNo, courseNo);
		model.addAttribute("Averages",averages);
		
		return "consult/studentAttendList";
	}

	
}
