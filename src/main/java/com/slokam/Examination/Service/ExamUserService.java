package com.slokam.Examination.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Examination.Dao.SelectedOptionDao;
import com.slokam.Examination.Dao.examUserDao;
import com.slokam.Examination.entity.ExamUser;
import com.slokam.Examination.entity.SelectedOption;

@Service
public class ExamUserService {
	@Autowired
	private examUserDao examuserdao;
	
	@Autowired
	private SelectedOptionDao selectedoptiondao;
	
	public void StartExamUserDetails(ExamUser examuser){
		examuser.setStarted(new Date());
		examuserdao.save(examuser);
	}
	
	public void EndExamUserDatails(Long examuserid){
		
		List<SelectedOption> correctoptions=selectedoptiondao.getselectoptionByExamUser(examuserid);
		Optional<ExamUser> optional=examuserdao.findById(examuserid);
		if(optional.isPresent()){
			ExamUser examuser=optional.get();
			
			if(correctoptions.isEmpty()){
				examuser.setResult(0);
				
			}else{
				examuser.setResult(correctoptions.size());
			}
			examuser.setEnd(new Date());
			examuserdao.save(examuser);
		}
		
	}
}
