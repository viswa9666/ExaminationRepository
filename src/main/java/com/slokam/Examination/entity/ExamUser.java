package com.slokam.Examination.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="exam_user")
public class ExamUser {

	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	@JoinColumn(name="uid")
	private UserPojo user;
	
	@ManyToOne
	@JoinColumn(name="eid")
	private ExamPojo exam;
	
	private Date started;
	private Date end;
	private Integer result;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UserPojo getUser() {
		return user;
	}
	public void setUser(UserPojo user) {
		this.user = user;
	}
	public ExamPojo getExam() {
		return exam;
	}
	public void setExam(ExamPojo exam) {
		this.exam = exam;
	}
	public Date getStarted() {
		return started;
	}
	public void setStarted(Date started) {
		this.started = started;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Integer getResult() {
		return result;
	}
	public void setResult(Integer result) {
		this.result = result;
	}
	
	
}
