package com.cmcglobal.service;

import java.util.List;

import com.cmcglobal.entity.Question;

public interface QuestionServices {
	List<Question> getAllQuestion();
	Question findById(String id); 
	void insertQuestion(Question question);
	void deletebyId(String id);
	String editQuestion(String id, Question newQuestion);
	List<Question> searchByContent( String contentSearch);
	void updateMultiQuestion(String category_id, String level_id, String tag_id, String question_id);
}
