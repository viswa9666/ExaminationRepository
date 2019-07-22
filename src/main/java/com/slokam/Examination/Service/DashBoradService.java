package com.slokam.Examination.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Examination.Dao.DashBoardDao;
import com.slokam.Examination.entity.DashBoardPojo;

@Service
public class DashBoradService {

	@Autowired
	private DashBoardDao dashboarddao;
	
	public List<DashBoardPojo> GetDashBoardDetails(){
		return dashboarddao.findAll();
	}
	public List<Object[]> GetDashBoardObjectdata(){
		return dashboarddao.GetDashBoardObjectdata();
	}
}
