package com.slokam.Examination.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.Examination.Service.DashBoradService;
import com.slokam.Examination.entity.DashBoardPojo;

@RestController
@RequestMapping("getdashboard")
@CrossOrigin
public class DashBoardController {

	@Autowired
	private DashBoradService dashboardservice;
	
	@GetMapping("/all")
	public ResponseEntity<List<DashBoardPojo>> GetDashBoardDetails(){
		List<DashBoardPojo> dashboard=dashboardservice.GetDashBoardDetails();
		ResponseEntity<List<DashBoardPojo>> re=new ResponseEntity<List<DashBoardPojo>>(dashboard,HttpStatus.OK);
		
		return re;
	}
	@GetMapping("check/all")
	public ResponseEntity<List<Object[]>> GetDashBoardObjectdata(){
		List<Object[]> dashlist=dashboardservice.GetDashBoardObjectdata();
		ResponseEntity<List<Object[]>> re=new ResponseEntity<List<Object[]>>(dashlist,HttpStatus.OK);
		
		return re;
	}
}
