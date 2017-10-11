package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.Course;

public interface CourseService {

	/**
	 * 添加课程
	 * @param course
	 */
	void addCourse(Course course);
	/**
	 * 修改课程
	 * @param course
	 */
	void updateCourse(Course course);
	/**
	 * 删除指定id的 课程
	 * @param pageIndex
	 */
	void deleteCourse(List<Long> ids);
	/**
	 *获取指定页码的 课程
	 * @param pageIndex
	 * @return
	 */
	List<Course> listCourse(Integer pageIndex);
	/**
	 * 获取总页数
	 * @return
	 */
	Integer getCount();
	
	Long getId(String name);
	
	List<Course> listName();
	
}
