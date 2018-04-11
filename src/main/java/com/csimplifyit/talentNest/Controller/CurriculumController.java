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

import com.csimplifyit.talentNest.DTO.CurriculumDTO;
import com.csimplifyit.talentNest.DTO.UserData;
import com.csimplifyit.talentNest.Service.CurriculumService;
import com.csimplifyit.talentNest.utils.Constant;

@RestController
public class CurriculumController {
	@Autowired 
	CurriculumService curriculumService;
	
	@PostMapping("/fetchCurriculum")
	public ResponseEntity<?> fetchCurriculum(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		List<CurriculumDTO> dtoList=null;
		try {
			UserData userData=session.getAttribute(Constant.SESSION_ATTR_USER)!=null?(UserData)session.getAttribute(Constant.SESSION_ATTR_USER):null;
			if(userData!=null) {
				if(userData.getAssignedCurriculum()!=null && !userData.getAssignedCurriculum().isEmpty()) {
					curriculumService.fetchCurriculum(Integer.parseInt(userData.getAssignedCurriculum()));
				}else {
					dtoList=curriculumService.fetchAllCurriculum();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(dtoList);
	}
	
	@PostMapping("/enrollForCurriculum")
	public ResponseEntity<?> enrollForCurriculum(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		CurriculumDTO dto=null;
		try {
			UserData userData=session.getAttribute(Constant.SESSION_ATTR_USER)!=null?(UserData)session.getAttribute(Constant.SESSION_ATTR_USER):null;
			if(userData!=null) {
				if(requestBody.get("id")!=null && !requestBody.get("id").toString().isEmpty()) {
					dto=curriculumService.enrollForCurriculum(userData,Integer.parseInt(requestBody.get("id").toString()));
					userData.setAssignedCurriculum(dto.getId().toString());
					session.setAttribute(Constant.SESSION_ATTR_USER, userData);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(dto);
	}

}
