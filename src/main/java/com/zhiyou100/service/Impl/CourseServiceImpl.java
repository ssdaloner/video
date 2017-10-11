package com.zhiyou100.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.CourseDao;
import com.zhiyou100.model.Course;
import com.zhiyou100.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseDao dao;
	
	public void addCourse(Course course) {
		
		dao.addCourse(course);
		
	}

	public void updateCourse(Course course) {
		
		dao.updateCourse(course);
		
	}

	public void deleteCourse(List<Long> ids) {
		dao.deleteCourse(ids);
		
	}

	public List<Course> listCourse(Integer pageIndex) {
		
		return dao.listCourse((pageIndex-1)*5);
	}

	public Integer getCount() {
		
		Integer result=(dao.getCount()+4)/5;
		
		return result;
	}

	public Long getId(String name) {
		
		return dao.getId(name);
	}

	public List<Course> listName() {
		// TODO Auto-generated method stub
		return dao.listName();
	}

}
