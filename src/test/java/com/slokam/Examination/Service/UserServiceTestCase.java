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

import com.slokam.Examination.entity.UserPojo;

@RunWith(SpringRunner.class)
@DataJpaTest
@ComponentScan("com.slokam.Examination.Controller,com.slokam.Examination.Service,com.slokam.Examination.Dao")
public class UserServiceTestCase {

	@Autowired
	private UserService userservice;
	
	
	/**
	* this verifyUserData method use to check null point checking
	* 1.step :- to create userpojo class object 
	* 2.step :- to set username
	
	
	*/
	
	
	@Test
	public void verifyUserData(){
		
		UserPojo user=new UserPojo();
		
		user.setName("viswanath");
		System.out.println("id value  before save"+user.getId());
		userservice.SaveUserData(user);
		System.out.println("id value  after save"+user.getId());
		
		Assert.assertEquals(1, user.getId());
		
		boolean flag=false;
		List<UserPojo> list=userservice.GetUserAll();
		for (UserPojo userPojo : list) {
			if(userPojo.getName().equals(user.getName()))
				flag=true;
			
		}
		//Assert.assertTrue(flag);
	}
	
}
