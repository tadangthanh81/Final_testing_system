/**
 * Create by: User - CMC
 * Create date: Feb 11, 2019
 * Modifier: User
 * Modified date: Feb 11, 2019
 * Description: ....
 * Version 1.0
 */
package com.cmcglobal.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmcglobal.entity.QuestionTag;
import com.cmcglobal.repository.QuestionTagRepository;
import com.cmcglobal.service.TagService;

/**
 * Create by: thanhtd - CMC
 * Create date: Feb 11, 2019
 * Modifier: thanhtd
 * Modified date: Feb 11, 2019
 * Description: ....
 * Version 1.0
 */
@Service
public class TagServiceImpl implements TagService {

	@Autowired
	QuestionTagRepository tagRepository;
	/* (non-Javadoc)
	 * @see com.cmcglobal.service.TagService#getAllTag()
	 */
	@Override
	public List<QuestionTag> getAllTag() {
		// TODO Auto-generated method stub
		return tagRepository.findAll();
	}
	/* (non-Javadoc)
	 * @see com.cmcglobal.service.TagService#createTag(com.cmcglobal.entity.QuestionTag)
	 */
	@Override
	public void createTag(QuestionTag tag) {
		// TODO Auto-generated method stub
		tagRepository.save(tag);
	}

}
