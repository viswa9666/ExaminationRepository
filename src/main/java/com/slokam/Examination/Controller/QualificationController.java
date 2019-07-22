package com.slokam.Examination.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Examination.Service.QualificationService;
import com.slokam.Examination.entity.QualificationPojo;

@RestController
@RequestMapping("qualification")
@CrossOrigin
public class QualificationController {

	@Autowired
	private QualificationService qualificationservice;
	
	@GetMapping("/all")
	public ResponseEntity<List<QualificationPojo>> getqualificationdetails(){
		List<QualificationPojo> quallist=qualificationservice.getqualificationdetails();
		ResponseEntity<List<QualificationPojo>> re=new ResponseEntity<>(quallist,HttpStatus.OK);
		
		return re;
	}
}
