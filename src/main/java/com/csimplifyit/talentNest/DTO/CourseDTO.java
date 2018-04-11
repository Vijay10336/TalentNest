package com.csimplifyit.talentNest.DTO;


import java.io.Serializable;
import java.util.List; 


public class CourseDTO implements Serializable{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2078362601621375248L;

	private Integer id	;
	
	private String name	;
	
	private String description	;
	
	private String duration	;
	
	private Integer mentor	;
	
	private Boolean isActive;
	
	private Short technicalCompetencyLevel	;
	
	private Short collaborativeCompetencyLevel;
	
	private Short communicativeCompetencyLevel;
	
	private Short selfgovernanceCompetencyLevel	;
	
	private List<CourseDTO> dtoList;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Integer getMentor() {
		return mentor;
	}
	public void setMentor(Integer mentor) {
		this.mentor = mentor;
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
	public List<CourseDTO> getDtoList() {
		return dtoList;
	}
	public void setDtoList(List<CourseDTO> dtoList) {
		this.dtoList = dtoList;
	}
	
	
	
}
