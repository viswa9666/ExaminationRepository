package com.slokam.Examination.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Examination.Service.NationalityService;
import com.slokam.Examination.entity.NationalityPojo;

@RestController
@RequestMapping("nationality")
@CrossOrigin
public class NationalityController {
	@Autowired
	private NationalityService nationalityservice;
	
	@GetMapping("/all")
	public ResponseEntity<List<NationalityPojo>> getqualificationdetails(){
		List<NationalityPojo> nationallist=nationalityservice.getnationalitydetails();
		ResponseEntity<List<NationalityPojo>> re=new ResponseEntity<>(nationallist,HttpStatus.OK);
		
		return re;
	}
	@PostMapping("savenation")
	public ResponseEntity<Map<String, String>> savenationality(@RequestBody NationalityPojo nation){
		Map<String, String> result=nationalityservice.saveNationality(nation);
		String status=result.get("status");
		
		ResponseEntity<Map<String, String>> re=null;
		if(status.equals("nationality saved successfully")){
			re = new ResponseEntity<Map<String, String>>(result,HttpStatus.OK);
		}else{
			re=new ResponseEntity<Map<String, String>>(result,HttpStatus.BAD_REQUEST);
		}
				
		
		
		return re;
		
	}

}
