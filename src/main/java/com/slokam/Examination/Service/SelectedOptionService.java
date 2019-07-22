package com.slokam.Examination.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Examination.Dao.SelectedOptionDao;
import com.slokam.Examination.entity.SelectedOption;

@Service
public class SelectedOptionService {

	@Autowired
	private SelectedOptionDao selectoptiondao;
	
	public void SaveSelectedOptions(List<SelectedOption> selectedoption ){
		
		selectoptiondao.saveAll(selectedoption);
	}
	
	public void  SaveSelectedOption(List<SelectedOption> selectedoption){
		if(!selectedoption.isEmpty()){
			SelectedOption selected=selectedoption.get(0);
			long examuserid=selected.getId();
			long Questionid=selected.getId();
			List<SelectedOption> preselOption=selectoptiondao.GetExistingOptions(examuserid, Questionid);
			if(!preselOption.isEmpty()){
				selectoptiondao.deleteAll(preselOption);
			}
			selectoptiondao.saveAll(selectedoption);
		}
		
	}
}
