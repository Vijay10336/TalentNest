package com.csimplifyit.talentNest.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coursechapterlink")
 public class CourseChapterLink extends BaseModel<Serializable> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4178731737901325047L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id") 
	private Integer id;
	@Column(name="chapterId")
	private Integer chapterId;
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
	
	public Integer getChapterId() {
		return chapterId;
	}
	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
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
