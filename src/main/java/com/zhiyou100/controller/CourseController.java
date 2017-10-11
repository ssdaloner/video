package com.zhiyou100.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.model.Course;
import com.zhiyou100.model.ListVo;
import com.zhiyou100.service.CourseService;
import com.zhiyou100.service.SubjectService;
import com.zhiyou100.service.Impl.SubjectServiceImpl;
import com.zhiyou100.vo.ResponseVo;

@RestController
public class CourseController {

	@Autowired
	private CourseService service;
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping(path="/zy_course_cms/search",method=RequestMethod.POST)
	public ResponseVo<ListVo> listCourse(@RequestBody HashMap<String, Integer> param) {
		
		
		ListVo data=new ListVo();
		
		//System.out.println(service.getCount());
		
		int a=service.getCount();
		
		int b=param.get("pageIndex");
		
		data.setCount(a);
		
		
		
		//System.out.println(param.get("pageIndex"));
		
		//System.out.println(service.listCourse(param.get("pageIndex")).size());
		
		
		if (b>a) {
			
			b=a;
			
		}
		
		if (b<1) {
			
			b=1;
		
		}
		
		data.setPageIndex(b);
		
		
		data.setListCourses(service.listCourse(b));
		
		return new ResponseVo(0,"",data);
	}
	
	@RequestMapping(path="/zy_course_cms/update",method=RequestMethod.POST)
	public ResponseVo updateCourse(@RequestBody Course course) {
		
//        Long id=subjectService.getSubjectId(course.getSubjectTitle());
//		
//		course.setSubjectId(id);
		
		service.updateCourse(course);
		
		System.out.println(course);
		
		return new ResponseVo(0,"修改成功",null);
	}
	
	@RequestMapping(path="/zy_course_cms/delete",method=RequestMethod.POST)
	public ResponseVo deleteCourse(@RequestBody HashMap<String, List<Long>> courseIds) {
		
		service.deleteCourse(courseIds.get("courseIds"));
		
		return new ResponseVo(0,"删除成功",null);
	}
	
	@RequestMapping(path="/zy_course_cms/add",method=RequestMethod.POST)
	public ResponseVo addCourse(@RequestBody Course course) {
		
		
		
		Long id=subjectService.getSubjectId(course.getSubjectTitle());
		
		course.setSubjectId(id);
		
		service.addCourse(course);
		
		
		
		return new ResponseVo(0,"添加成功",null);
	}
	
	@RequestMapping(path="/zy_course_cms/searchName",method=RequestMethod.GET)
	public ResponseVo<ListVo> listCourseName() {

		ListVo data=new ListVo();
		
		//System.out.println(service.listName().size());
		
		data.setListCourses(service.listName());

		return new ResponseVo<ListVo>(0,"",data);
	}
	
	
}
