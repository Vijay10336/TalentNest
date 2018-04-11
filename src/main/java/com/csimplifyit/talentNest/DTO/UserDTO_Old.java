package com.csimplifyit.talentNest.DTO;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

public class UserDTO_Old implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5576440473022423963L;
	private String displayName;
	private String token;
	private String status;
	private String Description;
	private String userId;
	private String userType;
	private String isCustomerToBeCharged;
	private String havingSkills;

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getIsCustomerToBeCharged() {
		return isCustomerToBeCharged;
	}

	public void setIsCustomerToBeCharged(String isCustomerToBeCharged) {
		this.isCustomerToBeCharged = isCustomerToBeCharged;
	}

	public String getHavingSkills() {
		return havingSkills;
	}

	public void setHavingSkills(String havingSkills) {
		this.havingSkills = havingSkills;
	}

}