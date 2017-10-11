package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.Subject;

public interface SubjectService {

	/**
	 * 获取学科列表
	 * @return
	 */
	List<Subject> listSubject();
	
	
	Long getSubjectId(String title);
}
