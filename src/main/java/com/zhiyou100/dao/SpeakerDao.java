package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.Speaker;

public interface SpeakerDao {

	void addSpeaker(Speaker speaker);
	
	void updateSpeaker(Speaker speaker);
	
	void deleteSpeaker(List<Long> ids);
	
	List<Speaker> listSpeaker(Integer pageIndex);
	
	Integer getCount();
	
	List<Speaker> listSpeakerby(Speaker speaker);
	
	long getspeakerId(String name);
	
	List<Speaker> listName();
}
