package com.zhiyou100.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.SubjectDao;
import com.zhiyou100.model.Subject;
import com.zhiyou100.service.SubjectService;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	private SubjectDao dao;
	
	public List<Subject> listSubject() {
		
		return dao.listSubject();
	}

	public Long getSubjectId(String title) {
		
		return dao.getSubjectId(title);
	}

}
