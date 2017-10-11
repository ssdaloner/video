package com.zhiyou100.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.model.Subject;
import com.zhiyou100.service.SubjectService;
import com.zhiyou100.vo.ResponseVo;

@RestController
public class SubjectController {

	@Autowired
	private SubjectService service;
	
	@RequestMapping(path="/zy_subject_cms/search",method=RequestMethod.GET)
	public ResponseVo<List<Subject>> listSubject() {
		
		List<Subject> data=service.listSubject();
		
		//System.out.println("我被调用了");
		
		//System.out.println(data);
		
		return new ResponseVo<List<Subject>>(0,"",data);
	}
	
}
