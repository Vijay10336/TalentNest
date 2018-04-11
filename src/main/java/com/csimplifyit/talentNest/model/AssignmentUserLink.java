package com.csimplifyit.talentNest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assignmentuserlink")
public class AssignmentUserLink extends BaseModel<Serializable> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4848967484650265179L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	@Column(name="assignmentId")
	private Integer assignmentId;
	@Column(name="userId")
	private Integer userId;
	@Column(name="isActive")
	private Boolean isActive;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(Integer assignmentId) {
		this.assignmentId = assignmentId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
