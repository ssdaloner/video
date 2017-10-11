package com.zhiyou100.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.SpeakerDao;
import com.zhiyou100.model.Selector;
import com.zhiyou100.model.Speaker;
import com.zhiyou100.service.SpeakerService;
@Service
public class SpeakerServiceImpl implements SpeakerService{

	@Autowired
	private SpeakerDao dao;
	
	public void addSpeaker(Speaker speaker) {
		
		dao.addSpeaker(speaker);
		
	}

	public void updateSpeaker(Speaker speaker) {
		
		dao.updateSpeaker(speaker);
		
	}

	public void deleteSpeaker(List<Long> ids) {
		
		dao.deleteSpeaker(ids);
		
	}

	public List<Speaker> listSpeaker(Integer pageIndex) {
		
		return dao.listSpeaker((pageIndex-1)*5);
	}

	public Integer getCount() {
		
		Integer result=(dao.getCount()+4)/5;
		return result;
	}

	public List<Speaker> listSpeakerby(Speaker speaker) {
		
	
		
		return dao.listSpeakerby(speaker);
	}

	public Long getId(String name) {
		// TODO Auto-generated method stub
		return dao.getspeakerId(name);
	}

	public List<Speaker> listName() {
		// TODO Auto-generated method stub
		return dao.listName();
	}

}
