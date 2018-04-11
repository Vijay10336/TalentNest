package com.csimplifyit.talentNest.model;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
@Entity
@Table(name="courseCurriculumlink")
public class CourseCurriculumLink extends BaseModel<Serializable>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3549503333175811263L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id") 
	private Integer id;
	@Column(name="curriculumId")
	private Integer curriculumId;
	@Column(name="courseId")
	private Integer courseId;
	@Column(name="seqNo")
	private Short  seqNo;
	@Column(name="isActive")
	private Boolean isActive;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCurriculumId() {
		return curriculumId;
	}
	public void setCurriculumId(Integer curriculumId) {
		this.curriculumId = curriculumId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
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
