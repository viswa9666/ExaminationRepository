package com.slokam.Examination.Service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

//import com.slokam.Examination.Exceptions.DataValidException;
import com.slokam.Examination.entity.OptionPojo;
import com.slokam.Examination.entity.QuestionPojo;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("com.slokam.Examination.Controller,com.slokam.Examination.Service,com.slokam.Examination.Dao")
public class QuestionTestCaseService {
	
	@Autowired
	private QuestionService questionservice;
	
	//@Test(expected=DataValidException.class)
	public void savequestion(){
		
		QuestionPojo question=new QuestionPojo();
		
		question.setDescription("what is java");
		List<OptionPojo> oprionlist=new ArrayList<>();
		
		OptionPojo option=new OptionPojo();
		question.setOptionlist(oprionlist);
		
		questionservice.SaveQuestions(question);
		
		QuestionPojo questionpojo=questionservice.GetByQuestionById(question.getId());
		Assert.assertNotNull(questionpojo);
		
		Assert.assertEquals(question.getDescription(), questionpojo.getDescription());
		
		System.out.println("Question is..."+question.getDescription()+":::"+questionpojo.getDescription());
	}
	@Test
	public void quetionTest(){
		QuestionPojo question=questionservice.GetByQuestionById(1);
		Assert.assertNull(question);
		System.out.println(question);
	}

}
