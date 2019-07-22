package com.slokam.Examination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Examination.Dao.QuestionDao;
import com.slokam.Examination.Service.QuestionService;
import com.slokam.Examination.entity.QuestionPojo;

@RestController
@RequestMapping("question")
public class QuestionController {
	@Autowired
	private QuestionService questionservice;
	
	@PostMapping
	public void SaveQuestions(@RequestBody QuestionPojo question){
		questionservice.SaveQuestions(question);
	}
	@GetMapping("/{id}")
	public QuestionPojo GetByQuestionById(@PathVariable long id){
		return questionservice.GetByQuestionById(id);
	}

}
