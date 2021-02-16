package com.cg.ppmtoolapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Project {
    
	  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "Project Name Required" )
	private String ProjectName;
	
	@NotBlank(message = "Project Identifier Required" )
	@Size(min=4, max=6, message = "Size must be between 4 to 6")
	@Column(updatable=false, unique=true)
	private String ProjectIdentifier;
	
	@NotBlank(message = "Project Description Required" )
	private String ProjectDescription;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date StartDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date EndDate;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date created_At;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date updated_At;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getProjectIdentifier() {
		return ProjectIdentifier;
	}
	public void setProjectIdentifier(String projectIdentifier) {
		ProjectIdentifier = projectIdentifier;
	}
	public String getProjectDescription() {
		return ProjectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		ProjectDescription = projectDescription;
	}
	public Date getStartDate() {
		return StartDate;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public Date getCreated_At() {
		return created_At;
	}
	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}
	public Date getUpdated_At() {
		return updated_At;
	}
	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}
	
	@PrePersist
	public void onCreate()
	{
		this.created_At= new Date();
	}
	
	@PreUpdate
	public void onUpdate()
	{
		this.updated_At= new Date();
	}
	
	
}
