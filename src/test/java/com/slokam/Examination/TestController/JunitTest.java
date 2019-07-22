package com.slokam.Examination.TestController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.slokam.Examination.entity.UserPojo;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("")
public class JunitTest {
	
	@Test
	public void VerifyUserTest(){
		UserPojo user=new UserPojo();
		user.setName("viswa");
		user.setGender("male");
		user.setPassword("viswa9666");
		
	}
		
	

}
