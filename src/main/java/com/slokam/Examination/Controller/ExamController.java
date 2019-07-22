package com.slokam.Examination.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Examination.Service.ExamService;
import com.slokam.Examination.entity.ExamPojo;

@RestController
@RequestMapping("exam")
@CrossOrigin
public class ExamController {

	@Autowired
	private ExamService examservice;
	
	@PostMapping
	public void SaveExamData(@RequestBody ExamPojo exam){
		examservice.SaveExamData(exam);
	}
	

	@GetMapping("/all")
	public  List<Object[]>GetExamDetails(){
		return examservice.GetExamDetails();
	}
	@GetMapping("check/all")
	public ResponseEntity<List<ExamPojo>> GetallExamdetails(){
		List<ExamPojo> examlist=examservice.GetallExamdetails();
	
		ResponseEntity<List<ExamPojo>> re= new ResponseEntity<>(examlist,HttpStatus.OK);
		return re;
	}
	
}
