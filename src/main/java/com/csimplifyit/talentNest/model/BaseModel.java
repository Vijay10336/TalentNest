package com.csimplifyit.talentNest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * This is the base class of all the models of It includes common attribute like
 * update, create date and owner.
 * 
 * @author Vijay Kaushik
 * @version 1.0
 *
 */
@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BaseModel<I extends Serializable> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3065238755906704375L;

	@Column(name = "modifiedBy")
	private String modifiedBy = "NONE";

	@Column(name = "createdBy")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "createdDate")
	private Date createdDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modifiedDate")
	private Date modifiedDate = new Date();

	@Version
	@Column(name = "RowVersion", nullable = false)
	private Integer rowVersion;

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Integer getRowVersion() {
		return rowVersion;
	}

	public void setRowVersion(Integer rowVersion) {
		this.rowVersion = rowVersion;
	}

}
