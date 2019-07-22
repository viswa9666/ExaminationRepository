package com.slokam.Examination.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserPojo {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String password;
	private String gender;
	private Date dob;
	@ManyToMany
	@JoinTable(name="user_qual",joinColumns={@JoinColumn(name="uid")},inverseJoinColumns={@JoinColumn(name="qid")})
	private List<QualificationPojo> qualification;
	
	@ManyToOne
	@JoinColumn(name="nid")
	private NationalityPojo nationality;
	
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public List<QualificationPojo> getQualification() {
		return qualification;
	}
	public void setQualification(List<QualificationPojo> qualification) {
		this.qualification = qualification;
	}
	public NationalityPojo getNationality() {
		return nationality;
	}
	public void setNationality(NationalityPojo nationality) {
		this.nationality = nationality;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserPojo [id=" + id + ", name=" + name + ", password=" + password + ", gender=" + gender + ", dob="
				+ dob + ", qualification=" + qualification + ", nationality=" + nationality + "]";
	}
	


}
