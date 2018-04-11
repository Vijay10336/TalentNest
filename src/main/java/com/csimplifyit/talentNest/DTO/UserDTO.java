package com.csimplifyit.talentNest.DTO;

import java.io.Serializable;
import java.util.Date;


public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6790756907530481105L;

	private Integer id;
	
	private String token;
	
	private String email;
	
	private String password;
	
	private String firstName;
	
	private String LastName;
	
	private String contactNumber;
	
	private String userType;
	
	private String assignedCurriculum;
	
	private String address;
	
	private String city;
	
	private Integer pincode;
	
	private String state;
	
	private String country;
	
	private Date dob;
	
	private String degree;
	
	private String specialization;
	
	private Integer degreeFromDate;
	
	private Integer degreeToDate;
	
	private String college;
	
	private Integer phone;
	
	private String mobile;
	
	private String facebookEmail;
	
	private String linkedInEmail;
	
	private String twitterEmail;
	
	private Boolean isActive;
	
	private Short technicalCompetencyLevel;
	
	private Short collaborativeCompetencyLevel;
	
	private Short communicativeCompetencyLevel;
	
	private Short selfgovernanceCompetencyLevel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public Integer getDegreeFromDate() {
		return degreeFromDate;
	}

	public void setDegreeFromDate(Integer degreeFromDate) {
		this.degreeFromDate = degreeFromDate;
	}

	public Integer getDegreeToDate() {
		return degreeToDate;
	}

	public void setDegreeToDate(Integer degreeToDate) {
		this.degreeToDate = degreeToDate;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFacebookEmail() {
		return facebookEmail;
	}

	public void setFacebookEmail(String facebookEmail) {
		this.facebookEmail = facebookEmail;
	}

	public String getLinkedInEmail() {
		return linkedInEmail;
	}

	public void setLinkedInEmail(String linkedInEmail) {
		this.linkedInEmail = linkedInEmail;
	}

	public String getTwitterEmail() {
		return twitterEmail;
	}

	public void setTwitterEmail(String twitterEmail) {
		this.twitterEmail = twitterEmail;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Short getTechnicalCompetencyLevel() {
		return technicalCompetencyLevel;
	}

	public void setTechnicalCompetencyLevel(Short technicalCompetencyLevel) {
		this.technicalCompetencyLevel = technicalCompetencyLevel;
	}

	public Short getCollaborativeCompetencyLevel() {
		return collaborativeCompetencyLevel;
	}

	public void setCollaborativeCompetencyLevel(Short collaborativeCompetencyLevel) {
		this.collaborativeCompetencyLevel = collaborativeCompetencyLevel;
	}

	public Short getCommunicativeCompetencyLevel() {
		return communicativeCompetencyLevel;
	}

	public void setCommunicativeCompetencyLevel(Short communicativeCompetencyLevel) {
		this.communicativeCompetencyLevel = communicativeCompetencyLevel;
	}

	public Short getSelfgovernanceCompetencyLevel() {
		return selfgovernanceCompetencyLevel;
	}

	public void setSelfgovernanceCompetencyLevel(Short selfgovernanceCompetencyLevel) {
		this.selfgovernanceCompetencyLevel = selfgovernanceCompetencyLevel;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
