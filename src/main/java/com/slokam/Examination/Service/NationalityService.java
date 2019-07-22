package com.slokam.Examination.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Examination.Dao.NationalityDao;
import com.slokam.Examination.entity.NationalityPojo;

@Service
public class NationalityService {
	@Autowired
	private NationalityDao nationalitydao;
	
	
	public List<NationalityPojo> getnationalitydetails(){
		return nationalitydao.findAll();
	}

	public  Map<String, String> saveNationality(NationalityPojo nation){
		
		Map<String, String> result=new HashMap<>();
		if(nation==null){
			
		}else{
			String name=nation.getNationalityname();
			if(name.isEmpty()){
				result.put("status", "please enter valid nationName");
				
			}else{
				NationalityPojo nationality=nationalitydao.findByNationalityname(name);
				
				if(nationality==null){
					System.out.println("no record");
					nationalitydao.save(nation);
					result.put("status", "nationality saved successfully");
					
				}else{
					System.out.println("record already existed");
					result.put("status", "nationality already existed");
				}
			}
			
					
		}
		return result;
//		String name=nation.getNationalityname();
//		
//		result.put("status", "SaveNationality success");
//		 nationalitydao.save(nation);
//		 
//		 return result;
//		
	}
	
}


