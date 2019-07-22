package com.slokam.Examination.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="qualification")
public class QualificationPojo {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String qualificationname;
	private String description;
	@Override
	public String toString() {
		return "QualificationPojo [id=" + id + ", qualificationname=" + qualificationname + ", description="
				+ description + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQualificationname() {
		return qualificationname;
	}
	public void setQualificationname(String qualificationname) {
		this.qualificationname = qualificationname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
