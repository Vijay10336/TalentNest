package com.csimplifyit.talentNest.DTO;

import java.io.Serializable;


public class ContentDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1531178070004218130L;

	private Integer id	;
	
	private String name	;
	
	private String description	;
	
	private String url	;
	
	private Short type;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Short getType() {
		return type;
	}
	public void setType(Short type) {
		this.type = type;
	}
	
	
}
