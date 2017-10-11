package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.Subject;

public interface SubjectDao {

	/**
	 * 获取学科列表
	 * @return
	 */
	List<Subject> listSubject();
	
	Long getSubjectId(String title);
}
