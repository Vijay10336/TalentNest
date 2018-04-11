package com.csimplifyit.talentNest.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class CandidateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 247652258734961401L;

	private Integer uid;

	private Integer associatedModule;

	private Integer availabilityStatus;

	private Integer companyId;
	private Date companyJoiningDate;

	private String createdBy;

	private Date createdDateTime;

	private String currentCompanyName;

	private String currentIndustry;

	private String currentJobTitle;

	private String displayName;

	private String empId;

	private String lastCheckInLocation;

	private Date lastLoginDateTime;

	private Double lattitude;

	private Double longitude;

	private String modifiedBy;

	private Date modifiedDateTime;

	private Date registerationDate;

	private Date resignationDate;

	private String userContactNo;

	private String userName;

	private String userPassword;

	private String userSkills;

	private Integer userStatus;

	private Integer userType;

	private String verificationCode;
	
	private Integer eid	;
	private Integer candidateID	;
	private String candidateName;
	private String enrollmentNo	;
	private Integer parentID;
	private String parentName;	
	private Integer mentorID;	
	private String mentorName;	
	private Date enrolledOnDateTime;
	private Integer enrolledForPeriod;
	private Date lastModificationDate;
	private Integer enrollmentStatus;
	private Date enrollmentAgreementAcceptanceON;
	private Date enrollmentExpiresOn;
	private Integer willTakeTrainingFromHome;
	private Integer candidateYearOfPassingOut;
	private String candidateCollegeName;	
	private String candidateCollegeURL;	

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getAssociatedModule() {
		return associatedModule;
	}

	public void setAssociatedModule(Integer associatedModule) {
		this.associatedModule = associatedModule;
	}

	public Integer getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(Integer availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Date getCompanyJoiningDate() {
		return companyJoiningDate;
	}

	public void setCompanyJoiningDate(Date companyJoiningDate) {
		this.companyJoiningDate = companyJoiningDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCurrentCompanyName() {
		return currentCompanyName;
	}

	public void setCurrentCompanyName(String currentCompanyName) {
		this.currentCompanyName = currentCompanyName;
	}

	public String getCurrentIndustry() {
		return currentIndustry;
	}

	public void setCurrentIndustry(String currentIndustry) {
		this.currentIndustry = currentIndustry;
	}

	public String getCurrentJobTitle() {
		return currentJobTitle;
	}

	public void setCurrentJobTitle(String currentJobTitle) {
		this.currentJobTitle = currentJobTitle;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getLastCheckInLocation() {
		return lastCheckInLocation;
	}

	public void setLastCheckInLocation(String lastCheckInLocation) {
		this.lastCheckInLocation = lastCheckInLocation;
	}

	public Date getLastLoginDateTime() {
		return lastLoginDateTime;
	}

	public void setLastLoginDateTime(Date lastLoginDateTime) {
		this.lastLoginDateTime = lastLoginDateTime;
	}

	public Double getLattitude() {
		return lattitude;
	}

	public void setLattitude(Double lattitude) {
		this.lattitude = lattitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(Date modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public Date getRegisterationDate() {
		return registerationDate;
	}

	public void setRegisterationDate(Date registerationDate) {
		this.registerationDate = registerationDate;
	}

	public Date getResignationDate() {
		return resignationDate;
	}

	public void setResignationDate(Date resignationDate) {
		this.resignationDate = resignationDate;
	}

	public String getUserContactNo() {
		return userContactNo;
	}

	public void setUserContactNo(String userContactNo) {
		this.userContactNo = userContactNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserSkills() {
		return userSkills;
	}

	public void setUserSkills(String userSkills) {
		this.userSkills = userSkills;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

}
