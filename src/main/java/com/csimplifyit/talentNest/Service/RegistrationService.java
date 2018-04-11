package com.csimplifyit.talentNest.Service;

import java.math.BigInteger;
import java.security.SecureRandom;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import com.csimplifyit.talentNest.DTO.UserDTO;
import com.csimplifyit.talentNest.DTO.UserDTO_Old;
import com.csimplifyit.talentNest.model.User;
import com.csimplifyit.talentNest.utils.Constant;
import com.csimplifyit.talentNest.utils.UrlResponse;

@Service
public class RegistrationService {
	
	@Autowired
	UserService userService;

	public UserDTO register(UserDTO dto) {
		User user=null;
		try {
			 user=userService.getUserbyEmail(dto.getEmail());
			if(user!=null && dto.getPassword()!=null && user.getPassword()!=null && dto.getPassword().equals(user.getPassword()) && user.getFirstName()!=null &&
					 !user.getFirstName().isEmpty() &&
					user.getLastName()!=null && !user.getLastName().isEmpty()) {
				dto=filUserDTO(user);
				return dto;
			}else {
				user=fillUserData(dto,user);
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
private User fillUserData(UserDTO dto,User user) {
		
		try {
			if(user == null)
			 user=new User();
			user.setFirstName(dto.getFirstName()!=null?dto.getFirstName():user.getFirstName());
			user.setLastName(dto.getLastName()!=null?dto.getLastName():user.getLastName());
			user.setEmail(dto.getEmail()!=null?dto.getEmail():user.getEmail());
			if(dto.getToken() == null || dto.getToken().isEmpty())
			{
			String token=generateUserToken();
			dto.setToken(token);
			}
			user.setToken(dto.getToken()!=null?dto.getToken():user.getToken());
			if(dto.getPassword()!=null && !dto.getPassword().isEmpty()) {
				dto.setPassword(new String(Base64Utils.encode(dto.getPassword().getBytes())));
			}
			
			user.setPassword(dto.getPassword()!=null?dto.getPassword():user.getPassword());
			user.setUserType(dto.getUserType()!=null?dto.getUserType():user.getUserType());
			user.setAssignedCurriculum(dto.getAssignedCurriculum()!=null?dto.getAssignedCurriculum():user.getAssignedCurriculum());
			user.setAddress(dto.getAddress()!=null?dto.getAddress():user.getAddress());
			user.setCity(dto.getCity()!=null?dto.getCity():user.getCity());
			user.setPincode(dto.getPincode()!=null?dto.getPincode():user.getPincode());
			user.setState(dto.getState()!=null?dto.getState():user.getState());
			user.setCountry(dto.getCountry()!=null?dto.getCountry():user.getCountry());
			user.setDob(dto.getDob()!=null?dto.getDob():user.getDob());
			user.setDegree(dto.getDegree()!=null?dto.getDegree():user.getDegree());
			user.setSpecialization(dto.getSpecialization()!=null?dto.getSpecialization():user.getSpecialization());
			user.setDegreeFromDate(dto.getDegreeFromDate()!=null?dto.getDegreeFromDate():user.getDegreeFromDate());
			user.setDegreeToDate(dto.getDegreeToDate()!=null?dto.getDegreeToDate():user.getDegreeToDate());
			user.setCollege(dto.getCollege()!=null?dto.getCollege():user.getCollege());
			user.setMobile(dto.getMobile()!=null?dto.getMobile():user.getMobile());
			user.setFacebookEmail(dto.getFacebookEmail()!=null?dto.getFacebookEmail():user.getFacebookEmail());
			user.setLinkedInEmail(dto.getLinkedInEmail()!=null?dto.getLinkedInEmail():user.getLinkedInEmail());
			user.setTwitterEmail(dto.getTwitterEmail()!=null?dto.getTwitterEmail():user.getTwitterEmail());
			user.setIsActive(dto.getIsActive()!=null?dto.getIsActive():user.getIsActive());
			user.setTechnicalCompetencyLevel(dto.getTechnicalCompetencyLevel()!=null?dto.getTechnicalCompetencyLevel():user.getTechnicalCompetencyLevel());
			user.setCollaborativeCompetencyLevel(dto.getCollaborativeCompetencyLevel()!=null?dto.getCollaborativeCompetencyLevel():user.getCollaborativeCompetencyLevel());
			user.setCommunicativeCompetencyLevel(dto.getCommunicativeCompetencyLevel()!=null?dto.getCommunicativeCompetencyLevel():user.getCommunicativeCompetencyLevel());
			user.setSelfgovernanceCompetencyLevel(dto.getSelfgovernanceCompetencyLevel()!=null?dto.getSelfgovernanceCompetencyLevel():user.getSelfgovernanceCompetencyLevel());
			return user;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
private String generateUserToken(){

	SecureRandom random = new SecureRandom();

	return new BigInteger(130, random).toString(32).substring(0,16);

	}
}
