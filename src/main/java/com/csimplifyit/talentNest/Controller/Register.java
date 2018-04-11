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

import com.csimplifyit.talentNest.DTO.CandidateDTO;
import com.csimplifyit.talentNest.DTO.UserDTO;
import com.csimplifyit.talentNest.DTO.UserData;
import com.csimplifyit.talentNest.Service.RegistrationService;
import com.csimplifyit.talentNest.utils.Constant;

@RestController
public class Register {
	
	@Autowired
	RegistrationService registrationService;
	
	@PostMapping("/register")
	public ResponseEntity<?> Register(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		UserDTO dto = null;
		try {
			dto= setUserData(requestBody);
			dto=registrationService.register(dto);
			UserData userData=null;
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
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.ok(dto);
	}
	public UserDTO setUserData(JSONObject reqData) {
		
		try {
			UserDTO dto =new UserDTO();
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			dto.setId(reqData.get("id") != null ? Integer.parseInt(reqData.get("id").toString()) : null);
			dto.setToken(reqData.get("token") != null ? reqData.get("token").toString() : null);
			dto.setEmail(reqData.get("email") != null ? reqData.get("email").toString() : null);
			dto.setPassword(reqData.get("password") != null ? reqData.get("password").toString() : null);
			dto.setFirstName(reqData.get("firstName") != null ? reqData.get("firstName").toString() : null);
			dto.setLastName(reqData.get("LastName") != null ? reqData.get("LastName").toString() : null);
			dto.setMobile(reqData.get("mobile") != null && !reqData.get("mobile").toString().isEmpty()
					? reqData.get("mobile").toString()
					: null);
			dto.setUserType(reqData.get("userType") != null ? reqData.get("userType").toString() : null);
			dto.setPincode(reqData.get("userType") != null ? Integer.parseInt(reqData.get("userType").toString()): null);
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
