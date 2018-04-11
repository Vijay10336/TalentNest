package com.csimplifyit.talentNest.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csimplifyit.talentNest.DTO.CourseDTO;
import com.csimplifyit.talentNest.DTO.CurriculumDTO;
import com.csimplifyit.talentNest.DTO.UserData;
import com.csimplifyit.talentNest.Service.CourseService;
import com.csimplifyit.talentNest.utils.Constant;

@RestController
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@PostMapping("/fetchCourse")
	public ResponseEntity<?> fetchCourse(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		CourseDTO dto=null;
		try {
			UserData userData=session.getAttribute(Constant.SESSION_ATTR_USER)!=null?(UserData)session.getAttribute(Constant.SESSION_ATTR_USER):null;
			if(userData!=null) {
				if(userData.getAssignedCurriculum()!=null && !userData.getAssignedCurriculum().isEmpty()) {
					dto=courseService.fetchCourse(Integer.parseInt(userData.getAssignedCurriculum()));
				}else {
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(dto);
	}

}
