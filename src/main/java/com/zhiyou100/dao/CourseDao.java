package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.Course;

public interface CourseDao {

	void addCourse(Course course);
	
	void updateCourse(Course course);
	
	List<Course> listCourse(Integer pageIndex);
	
	Integer getCount();
	
	void deleteCourse(List<Long> ids);
	
	long getId(String name);
	
	List<Course> listName();
	
}
