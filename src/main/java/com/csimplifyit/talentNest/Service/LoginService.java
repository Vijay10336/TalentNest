package com.csimplifyit.talentNest.Service;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import com.csimplifyit.talentNest.DTO.UserDTO;
import com.csimplifyit.talentNest.model.User;
import com.csimplifyit.talentNest.utils.Constant;
import com.csimplifyit.talentNest.utils.UrlResponse;

@Service
public class LoginService {
	
	@Autowired
	UserService userService;

	public UserDTO login(UserDTO dto) {
		User user=null;
		try {
			 user=userService.getUserbyEmail(dto.getEmail());
			 String password=new String(Base64Utils.encodeToString(dto.getPassword().getBytes())); 
			if(user!=null && password.equals(user.getPassword())) {
				user.setToken(generateUserToken());
				user=userService.updateUser(user);
				dto=filUserDTO(user);
				return dto;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	

	private UserDTO filUserDTO(User user) {
       try {
    	   UserDTO dto=new UserDTO();
    	   dto.setId(user.getId());
			dto.setFirstName(user.getFirstName());
			dto.setLastName(user.getLastName());
			dto.setEmail(user.getEmail());
			dto.setToken(user.getToken());
			if(user.getPassword()!=null && !user.getPassword().isEmpty()) {
				user.setPassword(new String(Base64Utils.decode(user.getPassword().getBytes())));
			}
			dto.setPassword(user.getPassword());
			dto.setUserType(user.getUserType());
			dto.setAssignedCurriculum(user.getAssignedCurriculum());
			dto.setAddress(user.getAddress());
			dto.setCity(user.getCity());
			dto.setPincode(user.getPincode());
			dto.setState(user.getState());
			dto.setCountry(user.getCountry());
			dto.setDob(user.getDob());
			dto.setDegree(user.getDegree());
			dto.setSpecialization(user.getSpecialization());
			dto.setDegreeFromDate(user.getDegreeFromDate());
			dto.setDegreeToDate(user.getDegreeToDate());
			dto.setCollege(user.getCollege());
			dto.setMobile(user.getMobile());
			dto.setFacebookEmail(user.getFacebookEmail());
			dto.setLinkedInEmail(user.getLinkedInEmail());
			dto.setTwitterEmail(user.getTwitterEmail());
			dto.setIsActive(user.getIsActive());
			dto.setTechnicalCompetencyLevel(user.getTechnicalCompetencyLevel());
			dto.setCollaborativeCompetencyLevel(user.getCollaborativeCompetencyLevel());
			dto.setCommunicativeCompetencyLevel(user.getCommunicativeCompetencyLevel());
			dto.setSelfgovernanceCompetencyLevel(user.getSelfgovernanceCompetencyLevel());
			return dto;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	private String generateUserToken(){

		SecureRandom random = new SecureRandom();

		return new BigInteger(130, random).toString(32).substring(0,16);

		}
	public JSONObject forgetPassword(String user) {
		JSONObject resData = null;
		try {/*

			JSONObject obj = jsonService.getJson("ForgetPassword");
			String url = obj.get(Constant.WEB_SERVICE_URL).toString();
			String data = obj.get(Constant.WEB_SERVICE_DATA).toString();
			String input = String.format(data, "'" + user + "'");

			UrlResponse response = httpservice.callWebService(url, input);
			if (response.getStatus() != 0) {
				JSONParser parser = new JSONParser();
				JSONObject resturnData = (JSONObject) parser.parse(response.getResponse());
				resData = new JSONObject();
				resData.put("status", "1");
				resData.put("response", resturnData);
				return resData;
			} else {
				resData = new JSONObject();
				resData.put("status", "0");
				resData.put("error", response.getError());
			}
		*/} catch (Exception e) {
			e.printStackTrace();
		}
		return resData;
	}


}
