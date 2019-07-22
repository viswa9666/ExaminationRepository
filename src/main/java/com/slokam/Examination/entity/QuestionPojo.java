package com.slokam.Examination.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="question")
public class QuestionPojo {
	
	@Id
	@GeneratedValue
	private long id;
	private String description;
	
	@OneToMany(mappedBy="question",cascade=CascadeType.ALL)
	private List<OptionPojo> optionlist;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<OptionPojo> getOptionlist() {
		return optionlist;
	}
	public void setOptionlist(List<OptionPojo> optionlist) {
		this.optionlist = optionlist;
	}
	
	

}
