package com.slokam.Examination.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Examination.Service.SelectedOptionService;
import com.slokam.Examination.entity.SelectedOption;

@RestController
@RequestMapping("selectoption")
public class SelectedOptionController {
	
	@Autowired
	private SelectedOptionService selctedoptionservice;

	@PostMapping
	public void SaveSelectedOptions(@RequestBody List<SelectedOption> selectedoptions ){
		selctedoptionservice.SaveSelectedOptions(selectedoptions);
	}
	
	@PostMapping("/save")
	public void SaveSelectedOption(@RequestBody List<SelectedOption> selectedoption){
		selctedoptionservice.SaveSelectedOption(selectedoption);
	}
}
