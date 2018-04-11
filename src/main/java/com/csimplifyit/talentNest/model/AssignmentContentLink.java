package com.csimplifyit.talentNest.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assignmentcontentlink")
public class AssignmentContentLink extends BaseModel<Serializable> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4232496208056094885L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="assignmentId")
	private Integer assignmentId;
	@Column(name="contentId")
	private Integer contentId;
	@Column(name="seqNo")
	private Short seqNo	;
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
	public Integer getContentId() {
		return contentId;
	}
	public void setContentId(Integer contentId) {
		this.contentId = contentId;
	}
	public Short getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(Short seqNo) {
		this.seqNo = seqNo;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	

}
