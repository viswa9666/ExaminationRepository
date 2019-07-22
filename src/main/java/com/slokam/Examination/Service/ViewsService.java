package com.slokam.Examination.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.Examination.Dao.ViewsDao;
import com.slokam.Examination.entity.ViewsPojo;

@Service
public class ViewsService {

	@Autowired
	private ViewsDao viewsdao;
	
	
	public long getdata(){
		
		Optional<ViewsPojo> view=viewsdao.findById(1l);
		if(view.isPresent()){
			ViewsPojo viewpojo=view.get();
		long longnumber=	viewpojo.getCount();
		longnumber++;
		viewpojo.setCount(longnumber);
		viewsdao.save(viewpojo);
		
		}
		Optional<ViewsPojo> optional=viewsdao.findById(1l);
		if(view.isPresent()){
			ViewsPojo viewpojo1=optional.get();
		long longnumber1=	viewpojo1.getNumber();
		return longnumber1;
		}
		return 0l;
	}
}
