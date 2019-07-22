package com.slokam.Examination.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="exam")
public class ExamPojo {
	
	@Id
	@GeneratedValue
	 private long id;
	 private String ecamName;
	 @ManyToOne
	 @JoinColumn(name="cbid")
	 private UserPojo createdBy;
	 private String subject;
	 @ManyToMany
	 @JoinTable(name="exam_question",joinColumns={@JoinColumn (name="eid")},inverseJoinColumns={@JoinColumn(name="eqid")})
	 private List<QuestionPojo> questionlist;
	 private Date createdDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEcamName() {
		return ecamName;
	}
	public void setEcamName(String ecamName) {
		this.ecamName = ecamName;
	}
	public UserPojo getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(UserPojo createdBy) {
		this.createdBy = createdBy;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public List<QuestionPojo> getQuestionlist() {
		return questionlist;
	}
	public void setQuestionlist(List<QuestionPojo> questionlist) {
		this.questionlist = questionlist;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	 
	 
}
