package com.slokam.Examination.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.Examination.entity.NationalityPojo;
@Repository
public interface NationalityDao extends JpaRepository<NationalityPojo, Integer> {

	public NationalityPojo findByNationalityname(String name);
}
