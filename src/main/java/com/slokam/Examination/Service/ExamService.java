package com.slokam.Examination.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Examination.Dao.ExamDao;
import com.slokam.Examination.entity.ExamPojo;
import com.slokam.Examination.entity.QuestionPojo;

@Service
public class ExamService {

	
	@Autowired
	private ExamDao examdao;
	
	public void SaveExamData(ExamPojo exam){
		exam.setCreatedDate(new Date());
		examdao.save(exam);
	}
	public List<Object[]> GetExamDetails(){
		return examdao.GetExamDetails();
	}
	
	public List<ExamPojo> GetallExamdetails(){
		return examdao.findAll();
	}
	
}
