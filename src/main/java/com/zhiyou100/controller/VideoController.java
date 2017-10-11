package com.zhiyou100.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyou100.dao.CourseDao;
import com.zhiyou100.dao.SpeakerDao;
import com.zhiyou100.model.AllIds;
import com.zhiyou100.model.Course;
import com.zhiyou100.model.ListVo;
import com.zhiyou100.model.Selector;
import com.zhiyou100.model.Video;
import com.zhiyou100.service.VideoService;
import com.zhiyou100.vo.ResponseVo;

@RestController
public class VideoController {

	@Autowired
	private VideoService service;
	@Autowired
	private CourseDao dao;
	
	@Autowired
	private SpeakerDao sdao;
	
	@RequestMapping(path="/zy_video_cms/search",method=RequestMethod.POST)
	public @ResponseBody ResponseVo<ListVo> listVideo(@RequestBody HashMap<String, Integer> pageIndex) {

		ListVo data=new ListVo();

		int a=service.getCount();

		int b=pageIndex.get("pageIndex");

		if (b>a) {

			b=a;

		}

		if (b<1) {

			b=1;

		}
		
		data.setCount(a);
		
		data.setPageIndex(b);

		data.setListVideo(service.listVideo(b));

		

		return new ResponseVo<ListVo>(0,"",data);
	}
	
	@RequestMapping(path="/zy_video_cms/searchby",method=RequestMethod.POST)
	public ResponseVo<ListVo> listVideoby(@RequestBody Selector selector) {
		
		ListVo data=new ListVo();
		
		data.setListVideo(service.listVideo(selector));
		
		data.setCount(selector.getPageIndex());
		
		
		return new ResponseVo<ListVo>(0,"",data);
	}
	
	@RequestMapping(path="/zy_video_cms/add",method=RequestMethod.POST)
	public ResponseVo addVideo(@RequestBody Video video) {
		
		
		video.setCourseId(dao.getId(video.getCourseTitle()));
		
		video.setSpeakerId(sdao.getspeakerId(video.getSpeakerName()));
		
		service.addVideo(video);
		
		return new ResponseVo(0,"添加成功",null);
	}
	
	@RequestMapping(path="/zy_video_cms/delete",method=RequestMethod.POST)
	public ResponseVo deleteVideo(@RequestBody HashMap<String, List<Long>> ids) {
		
		service.deleteVideo(ids.get("videoIds"));
		
		return new ResponseVo(0,"删除成功",null);
	}
	@RequestMapping(path="/zy_video_cms/update",method=RequestMethod.POST)
	public ResponseVo updateVideo(@RequestBody Video video) {
		
		//System.out.println(video.getCourseTitle());
		
        video.setCourseId(dao.getId(video.getCourseTitle()));
		
		video.setSpeakerId(sdao.getspeakerId(video.getSpeakerName()));
		
	  service.updateVideo(video);
		
		
		return new ResponseVo(0,"修改成功",null);
	}
	@RequestMapping(path="/zy_video_cms/searchBy",method=RequestMethod.POST)
	public ResponseVo<ListVo> searchBy(@RequestBody AllIds allIds) {
		
	
		ListVo data=new ListVo();
		
		
		List<Video> list=service.searchbyid(allIds);
		
		System.out.println(list.size());
		
		data.setListVideo(list);
		
		
		return new ResponseVo(0,"",data);
		
	}
	
	
}
