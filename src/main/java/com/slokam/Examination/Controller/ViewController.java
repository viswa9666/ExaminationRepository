package com.slokam.Examination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Examination.Service.ViewsService;

@RestController
@RequestMapping("getnumber")
@CrossOrigin
public class ViewController {
	@Autowired
	private ViewsService viewservice;
	
	@GetMapping("/all")
	public ResponseEntity<Long> getnumber(){
		long l =viewservice.getdata();
		ResponseEntity<Long> re= new ResponseEntity<Long>(l,HttpStatus.OK);
		
		return re;
	}
	
	

}
