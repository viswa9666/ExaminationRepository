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

import com.slokam.Examination.entity.OptionPojo;
import com.slokam.Examination.entity.QuestionPojo;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("com.slokam.Examination.Controller,com.slokam.Examination.Service,com.slokam.Examination.Dao")
public class QuestionServiceTestCase {

	@Autowired
	private QuestionService quetionservice;
	
	@Test
	public void quetiontesting(){
		
		QuestionPojo quetion=quetionservice.GetByQuestionById(1);
		
		Assert.assertNull(quetion);
		
	}
	@Test
	public void quetionSaveTesting(){
		QuestionPojo quetion=new QuestionPojo();
		quetion.setDescription("save the name");
		List<OptionPojo> options=new ArrayList<>();
		OptionPojo option=new OptionPojo();
		option.setDes("viswanath");
		options.add(option);
		quetion.setOptionlist(options);
		quetionservice.SaveQuestions(quetion);
		QuestionPojo responce=quetionservice.GetByQuestionById(1);
		
		Assert.assertNotNull(responce);
		
		Assert.assertEquals(quetion.getDescription(), responce.getDescription());
	}
}
