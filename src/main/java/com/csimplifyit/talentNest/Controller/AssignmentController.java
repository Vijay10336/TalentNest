package com.csimplifyit.talentNest.Controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csimplifyit.talentNest.DTO.AssignmentDTO;

import com.csimplifyit.talentNest.DTO.UserData;
import com.csimplifyit.talentNest.Service.AssignmentService;

import com.csimplifyit.talentNest.utils.Constant;

@RestController
public class AssignmentController {
	@Autowired
	AssignmentService assignmentService;
	
	@PostMapping("/fetchUserAssignment")
	public ResponseEntity<?> fetchCourse(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		AssignmentDTO dto=null;
		try {
			UserData userData=session.getAttribute(Constant.SESSION_ATTR_USER)!=null?(UserData)session.getAttribute(Constant.SESSION_ATTR_USER):null;
			if(userData!=null) {
				if(userData.getAssignedCurriculum()!=null && !userData.getAssignedCurriculum().isEmpty()) {
					dto=assignmentService.fetchUserAssignment(userData.getUid());
				}else {
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(dto);
	}

}
