package com.slokam.Examination.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Examination.Dao.QuestionDao;
import com.slokam.Examination.Exceptions.DataValidException;
import com.slokam.Examination.entity.OptionPojo;
import com.slokam.Examination.entity.QuestionPojo;

@Service
public class QuestionService {

	@Autowired
	private QuestionDao questiondao;
	
	
	public void SaveQuestions(QuestionPojo question){
		 List<OptionPojo> optionlist=question.getOptionlist();
		 
		 if(optionlist!=null && optionlist.size()>0){
			 
			 for (OptionPojo optionPojo : optionlist) {
				 optionPojo.setQuestion(question);
			 }		 
		 }else{
		      throw new DataValidException("provide exception");
		 
		 }
		questiondao.save(question);
	}

	public QuestionPojo GetByQuestionById(long id){
		Optional<QuestionPojo> option=questiondao.findById(id);
		
		if(option.isPresent()){
			
			QuestionPojo quetion=option.get();
			
			List<OptionPojo> optionlist=quetion.getOptionlist();
			
			for (OptionPojo optionpojo : optionlist) {
				optionpojo.setQuestion(null);
			}
			
			return quetion;
		}else{
			return null;
		}
	
	
	}
}
