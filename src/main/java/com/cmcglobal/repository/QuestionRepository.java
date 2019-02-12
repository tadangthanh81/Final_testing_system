package com.cmcglobal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cmcglobal.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, String> {
	List<Question>  findByContentContaining(String contentSearch);
	@Query(value="update question set category_id=?1, level_id=?2, tag_id=?3 where question_id=?4", nativeQuery=true)
	void updateMultiQuestion(String category_id, String level_id, String tag_id, String question_id);
}
