package com.slokam.Examination.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.Examination.entity.ExamUser;
@Repository
public interface examUserDao extends JpaRepository<ExamUser, Long> {

}
