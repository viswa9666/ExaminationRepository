package com.slokam.Examination.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Examination.Dao.UserDao;
import com.slokam.Examination.entity.UserPojo;

@Service
public class UserService {

	@Autowired
	private UserDao userdao;
	
	
	public void SaveUserData(UserPojo userpojo){
		System.out.println(userpojo);
		userdao.save(userpojo);
	}
	public List<UserPojo> GetUserAll(){
		return userdao.findAll();
	}
	public String someThing(){
		
		return "Hi";
	}
	
}
