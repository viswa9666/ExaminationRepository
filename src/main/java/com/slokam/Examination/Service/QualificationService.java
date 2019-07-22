package com.slokam.Examination.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Examination.Dao.QualificationDao;
import com.slokam.Examination.entity.QualificationPojo;

@Service
public class QualificationService {
	@Autowired
	private QualificationDao qualificationdao;
	
	public List<QualificationPojo> getqualificationdetails(){
		return qualificationdao.findAll();
	}

}
