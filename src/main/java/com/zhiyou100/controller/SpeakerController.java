package com.zhiyou100.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.fabric.xmlrpc.base.Data;
import com.zhiyou100.model.ListVo;
import com.zhiyou100.model.Speaker;
import com.zhiyou100.service.SpeakerService;
import com.zhiyou100.vo.ResponseVo;

@RestController
public class SpeakerController {

	@Autowired
	private SpeakerService service;

	@RequestMapping(path="/zy_speaker_cms/search",method=RequestMethod.POST)
	public ResponseVo<ListVo> listSpeaker(@RequestBody HashMap<String, Integer> pageIndex) {

		ListVo data=new ListVo();

		int b=pageIndex.get("pageIndex");

		int a=service.getCount();

		if (b>a) {

			b=a;

		}

		if (b<1) {

			b=1;
		}
		data.setCount(a);

		data.setPageIndex(b);

		data.setListSpeaker(service.listSpeaker(b));

		//System.out.println(service.listSpeaker(b).size());



		return new ResponseVo<ListVo>(0,"",data);
	}

	@RequestMapping(path="/zy_speaker_cms/searchby",method=RequestMethod.POST)
	public ResponseVo<ListVo> listSpeakerby(@RequestBody Speaker speaker) {

		ListVo data=new ListVo();

		data.setListSpeaker(service.listSpeakerby(speaker));

		return new ResponseVo<ListVo>(0,"",data);
	}

	@RequestMapping(path="/zy_speaker_cms/delete",method=RequestMethod.POST)
	public ResponseVo deleteSpeaker(@RequestBody HashMap<String, List<Long>> ids) {

		service.deleteSpeaker(ids.get("speakerIds"));

		return new ResponseVo(0,"删除成功",null);
	}

	@RequestMapping(path="/zy_speaker_cms/update",method=RequestMethod.POST)
	public ResponseVo updateSpeaker(@RequestBody Speaker speaker) {

		service.updateSpeaker(speaker);

		return new ResponseVo(0,"修改成功",null);
	}

	@RequestMapping(path="/zy_speaker_cms/add",method=RequestMethod.POST)
	public ResponseVo addSpeaker(@RequestBody Speaker speaker) {

		service.addSpeaker(speaker);

		return new ResponseVo(0,"添加成功",null);
	}
	
	@RequestMapping(path="/zy_speaker_cms/searchName",method=RequestMethod.GET)
	public ResponseVo<ListVo> listSpeakerName() {

		ListVo data=new ListVo();
		
		data.setListSpeaker(service.listName());
		
		//System.out.println(service.listName().size());

		return new ResponseVo<ListVo>(0,"",data);
	}

}
