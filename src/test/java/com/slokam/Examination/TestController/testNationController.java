package com.slokam.Examination.TestController;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.slokam.Examination.Controller.NationalityController;
import com.slokam.Examination.entity.NationalityPojo;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("com.slokam.Examination.Controller,com.slokam.Examination.Service,com.slokam.Examination.Dao")

public class testNationController {
	
		
		@Autowired
		private NationalityController nationalController;
		
		//test case 1
		
		@Test
		public void verifyNationalitySaveEmty(){
			
			String expected="please enter valid nationName";
			
			NationalityPojo nation=new NationalityPojo();
			ResponseEntity<Map<String, String>> result=nationalController.savenationality(nation);
			Map<String, String> mapresult=result.getBody();
			String actual=mapresult.get("status");
			Assert.assertEquals(expected, actual);
			
		
//			ResponseEntity<Map<String, String>> result=nationalController.savenationality(nation);
//			Map<String, String> mapresult=result.getBody();
//			
//			String actual=mapresult.get("status");
//			Assert.assertEquals(expected, actual);
		}
		
//		// test case ==2
//		@Test
//		public void saveNationalityName(){
//			
//			String expected1="nationality saved successfully";
//			
//			NationalityPojo nation1=new NationalityPojo();
//			nation1.setNationalityname("dubai");
//			
//			ResponseEntity<Map<String, String>> result1=nationalController.savenationality(nation1);
//			Map<String, String> mapresult1=result1.getBody();
//			String actual1=mapresult1.get("status");
//			
//			Assert.assertEquals(expected1, actual1);
//		}
//		
//		
//		
//		@Test
//		public void saveNationalityCheckDuplication(){
//			
//			String expected1="nationality already existed";
//			
//			NationalityPojo nation1=new NationalityPojo();
//			nation1.setNationalityname("india");
//			
//			nationalController.savenationality(nation1);
//			
//			NationalityPojo nation2=new NationalityPojo();
//			nation2.setNationalityname("india");
//			
//			ResponseEntity<Map<String, String>> result1=nationalController.savenationality(nation2);
//			Map<String, String> mapresult1=result1.getBody();
//			String actual1=mapresult1.get("status");
//			
//			Assert.assertEquals(expected1, actual1);
//		}
//
//		


}
