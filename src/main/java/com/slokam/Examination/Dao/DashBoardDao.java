package com.slokam.Examination.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.slokam.Examination.entity.DashBoardPojo;

@Repository
public interface DashBoardDao extends JpaRepository<DashBoardPojo,Integer> {
	@Query("select d.id,d.name,d.salary,d.country,d.city from DashBoardPojo d")
	public List<Object[]> GetDashBoardObjectdata();

}
