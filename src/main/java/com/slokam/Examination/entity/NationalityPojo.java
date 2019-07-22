package com.slokam.Examination.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nationality")
public class NationalityPojo {

	
	@Id
	@GeneratedValue
	private Integer id;
	private String nationalityname;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNationalityname() {
		return nationalityname;
	}
	public void setNationalityname(String nationalityname) {
		this.nationalityname = nationalityname;
	}
	@Override
	public String toString() {
		return "NationalityPojo [id=" + id + ", nationalityname=" + nationalityname + "]";
	}
	
	
}
