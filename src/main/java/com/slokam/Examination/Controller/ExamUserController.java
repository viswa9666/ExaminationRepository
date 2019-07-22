package com.slokam.Examination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Examination.Service.ExamUserService;
import com.slokam.Examination.entity.ExamUser;

@RestController
@RequestMapping("examuser")
public class ExamUserController {

	@Autowired
	private ExamUserService examuserservice;
	
	@PostMapping("start")
	public void StartExamUserDetails(@RequestBody ExamUser examuser){
		examuserservice.StartExamUserDetails(examuser);
	}
	@PostMapping("/end{id}")
	public void EndExamUserDatails(@PathVariable("id") Long examuserid){
		examuserservice.EndExamUserDatails(examuserid);
		
	}
	
}
