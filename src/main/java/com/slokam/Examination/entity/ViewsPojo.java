package com.slokam.Examination.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="view")
public class ViewsPojo {
	
	@Id
	@GeneratedValue
	private long id;
	private long number;
	private long count;
	
	
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "ViewsPojo [id=" + id + ", number=" + number + "]";
	}
	
	

}
