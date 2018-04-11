package com.csimplifyit.talentNest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="curriculum")
public class Curriculum extends BaseModel<Serializable> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5091681738852840657L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="description")
	private String  description;
	@Column(name="duration")
	private String  duration;
	@Column(name="mentorId")
	private Integer mentorId;
	@Column(name="userType")
	private String  userType;
	@Column(name="isActive")
	private Boolean isActive;
	@Column(name="technicalCompetencyLevel")
	private Short technicalCompetencyLevel;
	@Column(name="collaborativeCompetencyLevel")
	private Short collaborativeCompetencyLevel;
	@Column(name="communicativeCompetencyLevel")
	private Short communicativeCompetencyLevel;
	@Column(name="selfgovernanceCompetencyLevel")
	private Short selfgovernanceCompetencyLevel;
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
	public Integer getMentorId() {
		return mentorId;
	}
	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
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
	
}
