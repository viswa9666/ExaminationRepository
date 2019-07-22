package com.slokam.Examination.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.Examination.entity.QualificationPojo;
@Repository
public interface QualificationDao extends JpaRepository<QualificationPojo,Integer> {

}
