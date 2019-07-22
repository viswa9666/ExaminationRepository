package com.slokam.Examination.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.Examination.entity.ViewsPojo;
@Repository
public interface ViewsDao extends JpaRepository<ViewsPojo, Long> {
	

}
