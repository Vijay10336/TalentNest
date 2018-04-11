package com.csimplifyit.talentNest.Controller;



import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;


import org.json.simple.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csimplifyit.talentNest.DTO.UserDTO;
import com.csimplifyit.talentNest.DTO.UserDTO_Old;
import com.csimplifyit.talentNest.DTO.UserData;
import com.csimplifyit.talentNest.Service.CourseService;
import com.csimplifyit.talentNest.Service.LoginService;

import com.csimplifyit.talentNest.utils.Constant;


@RestController
public class Login {
	

	@Autowired
	LoginService loginService;
	
	@Autowired
	CourseService courseService;
	
	

	@PostMapping("/doLogin")
	public ResponseEntity<?> doLogin(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		UserDTO dto=null;
		try {
			
			UserData userData=session.getAttribute(Constant.SESSION_ATTR_USER)!=null?(UserData)session.getAttribute(Constant.SESSION_ATTR_USER):null;
			if(userData == null ||( userData!=null && (userData.getToken() == null || userData.getToken().isEmpty()) )) {
				 dto=setUserData(requestBody);
				
				if(dto!=null) {
					dto=loginService.login(dto);
				 if(dto!=null) {
					 if(dto.getFirstName()!=null && !dto.getFirstName().isEmpty() && dto.getLastName()!=null && !dto.getLastName().isEmpty()) {
					if(userData == null)
						userData=new UserData();
					userData.setUid(dto.getId());
					userData.setName(dto.getFirstName()+" "+dto.getLastName());
					userData.setEmail(dto.getEmail());
					userData.setAssignedCurriculum(dto.getAssignedCurriculum());
					userData.setUserType(dto.getUserType());
					userData.setToken(dto.getToken());
					session.setAttribute(Constant.SESSION_ATTR_USER, userData);
				}else {
					 if(userData == null)
						userData=new UserData();
					 userData.setToken(dto.getToken());
					 userData.setEmail(dto.getEmail());
					 userData.setUid(dto.getId());
					 session.setAttribute(Constant.SESSION_ATTR_USER, userData);
				 }
				}
			}
		}	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(dto);
	}
	
	@PostMapping("/forgetPassword")
	public ResponseEntity<?> forgotPassword(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		try {
			
				String user = requestBody.get("username")!=null && !requestBody.get("username").equals("")?requestBody.get("username").toString():null;
				JSONObject resData=loginService.forgetPassword(user);
				return ResponseEntity.ok(resData);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@PostMapping("/loginCheck")
	public ResponseEntity<?> loginCheck(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		
		UserDTO_Old response=session.getAttribute(Constant.SESSION_ATTR_USER)!=null?(UserDTO_Old)session.getAttribute(Constant.SESSION_ATTR_USER):null;
		return ResponseEntity.ok(response);
	}
	@PostMapping("/getUserCourses")
	public ResponseEntity<?> getUserCourses(HttpSession session) {
		JSONObject response=new JSONObject();
		UserDTO_Old user=session.getAttribute(Constant.SESSION_ATTR_USER)!=null?(UserDTO_Old)session.getAttribute(Constant.SESSION_ATTR_USER):null;
		if(user!=null && user.getToken()!=null && !user.getToken().isEmpty()) {
			JSONObject data= courseService.getUserCourseData(user);
			response.put("CourseData",data);
		}
		return ResponseEntity.ok(response);
	}
	@PostMapping("/getUserAssignment")
	public ResponseEntity<?> getUserAssignment(HttpSession session) {
		JSONObject response=new JSONObject();
		UserDTO_Old user=session.getAttribute(Constant.SESSION_ATTR_USER)!=null?(UserDTO_Old)session.getAttribute(Constant.SESSION_ATTR_USER):null;
		if(user!=null && user.getToken()!=null && !user.getToken().isEmpty()) {
			JSONObject data=courseService.getUserAssignmentData(user);
			response.put("CourseData",data);
		}
		return ResponseEntity.ok(response);
	}
	@PostMapping("/getCourseDetail")
	public ResponseEntity<?> getCourseDetail(@Valid @RequestBody JSONObject requestBody,HttpSession session) {
		JSONObject response=new JSONObject();
		UserDTO_Old user=session.getAttribute(Constant.SESSION_ATTR_USER)!=null?(UserDTO_Old)session.getAttribute(Constant.SESSION_ATTR_USER):null;
		if(user!=null && user.getToken()!=null && !user.getToken().isEmpty()) {
			String courseId=requestBody.get("idcourse")!=null?requestBody.get("idcourse").toString():"";
			JSONObject data=courseService.getCourseDetails(user,courseId);
			response.put("CourseData",data);
		}
		return ResponseEntity.ok(response);
	}
	public UserDTO setUserData(JSONObject reqData) {
		UserDTO dto =new UserDTO();
		try {
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

			dto.setId(reqData.get("id") != null ? Integer.parseInt(reqData.get("id").toString()) : null);
			dto.setToken(reqData.get("token") != null ? reqData.get("token").toString() : null);
			dto.setEmail(reqData.get("email") != null ? reqData.get("email").toString() : null);
			dto.setPassword(reqData.get("password") != null ? reqData.get("password").toString() : null);
			dto.setFirstName(reqData.get("firstName") != null ? reqData.get("firstName").toString() : null);
			dto.setLastName(reqData.get("lastName") != null ? reqData.get("lastName").toString() : null);
			dto.setMobile(reqData.get("mobile") != null && !reqData.get("mobile").toString().isEmpty()
					? reqData.get("mobile").toString()
					: null);
			dto.setUserType(reqData.get("userType") != null ? reqData.get("userType").toString() : null);
			dto.setAssignedCurriculum(
					reqData.get("assignedCurriculum") != null ? reqData.get("assignedCurriculum").toString() : null);
			dto.setAddress(reqData.get("address") != null ? reqData.get("address").toString() : null);
			dto.setCity(reqData.get("city") != null ? reqData.get("city").toString() : null);
			dto.setState(reqData.get("state") != null ? reqData.get("state").toString() : null);
			dto.setCountry(reqData.get("country") != null ? reqData.get("country").toString() : null);

			dto.setDob(reqData.get("dob") != null && !reqData.get("dob").toString().isEmpty()
					? format.parse(reqData.get("dob").toString())
					: null);

			dto.setDegree(reqData.get("degree") != null ? reqData.get("degree").toString() : null);
			dto.setSpecialization(
					reqData.get("specialization") != null ? reqData.get("specialization").toString() : null);
			dto.setDegreeFromDate(
					reqData.get("degreeFromDate") != null && !reqData.get("degreeFromDate").toString().isEmpty()
							? Integer.parseInt(reqData.get("degreeFromDate").toString())
							: null);

			dto.setDegreeToDate(reqData.get("degreeToDate") != null && !reqData.get("degreeToDate").toString().isEmpty()
					? Integer.parseInt(reqData.get("degreeToDate").toString())
					: null);

			dto.setCollege(reqData.get("college") != null ? reqData.get("college").toString() : null);
			dto.setFacebookEmail(reqData.get("facebookEmail") != null ? reqData.get("facebookEmail").toString() : null);
			dto.setLinkedInEmail(reqData.get("linkedInEmail") != null ? reqData.get("linkedInEmail").toString() : null);

			dto.setTwitterEmail(reqData.get("twitterEmail") != null ? reqData.get("twitterEmail").toString() : null);
			dto.setIsActive(
					reqData.get("isActive") != null && !reqData.get("isActive").toString().isEmpty() ? true : false);
			dto.setTechnicalCompetencyLevel(reqData.get("technicalCompetencyLevel") != null
					&& !reqData.get("technicalCompetencyLevel").toString().isEmpty()
							? new Short(reqData.get("technicalCompetencyLevel").toString())
							: new Short("0"));
			dto.setCollaborativeCompetencyLevel(reqData.get("collaborativeCompetencyLevel") != null
					&& !reqData.get("collaborativeCompetencyLevel").toString().isEmpty()
							? new Short(reqData.get("collaborativeCompetencyLevel").toString())
							: new Short("0"));
			dto.setCommunicativeCompetencyLevel(reqData.get("communicativeCompetencyLevel") != null
					&& !reqData.get("communicativeCompetencyLevel").toString().isEmpty()
							? new Short(reqData.get("communicativeCompetencyLevel").toString())
							: new Short("0"));
			dto.setSelfgovernanceCompetencyLevel(reqData.get("selfgovernanceCompetencyLevel") != null
					&& !reqData.get("selfgovernanceCompetencyLevel").toString().isEmpty()
							? new Short(reqData.get("selfgovernanceCompetencyLevel").toString())
							: new Short("0"));
			return dto;
		} catch (DateTimeParseException de) {
			de.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	
	}
