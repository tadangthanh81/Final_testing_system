package com.cmcglobal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cmcglobal.entity.QuestionType;
@Repository
public interface QuestionTypeRepository extends JpaRepository<QuestionType, Integer> {

}
