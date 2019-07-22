package com.slokam.Examination.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="optionpojo")
public class OptionPojo {
	
	@Id
	@GeneratedValue
	private long id;
	private String des;
	private boolean correct;
	@ManyToOne
	@JoinColumn(name="qid")
	private QuestionPojo question;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}


	public QuestionPojo getQuestion() {
		return question;
	}

	public void setQuestion(QuestionPojo question) {
		this.question = question;
	}

	public boolean isCorrect() {
		return correct;
	}
	
	
	

}
