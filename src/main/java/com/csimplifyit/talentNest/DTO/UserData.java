package com.csimplifyit.talentNest.DTO;

import java.io.Serializable;

public class UserData  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -969154520974327947L;

	private Integer uid;
	
	private String token;
	
	private String userType;
	
	private String assignedCurriculum;
	
	private String name;
	
	private String email;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getAssignedCurriculum() {
		return assignedCurriculum;
	}

	public void setAssignedCurriculum(String assignedCurriculum) {
		this.assignedCurriculum = assignedCurriculum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
