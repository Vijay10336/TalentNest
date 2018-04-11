package com.csimplifyit.talentNest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable; 


@Entity
@Table(name="course")
public class Course extends BaseModel<Serializable>{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3074438573387418330L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id	;
	@Column(name="name")
	private String name	;
	@Column(name="description")
	private String description	;
	@Column(name="duration")
	private String duration	;
	@Column(name="mentor")
	private Integer mentor	;
	@Column(name="isActive")
	private Boolean isActive;
	@Column(name="technicalCompetencyLevel")
	private Short technicalCompetencyLevel	;
	@Column(name="collaborativeCompetencyLevel")
	private Short collaborativeCompetencyLevel;
	@Column(name="communicativeCompetencyLevel")
	private Short communicativeCompetencyLevel;
	@Column(name="selfgovernanceCompetencyLevel")
	private Short selfgovernanceCompetencyLevel	;
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
	
	
	
}
