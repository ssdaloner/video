package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.AllIds;
import com.zhiyou100.model.Selector;
import com.zhiyou100.model.Video;

public interface VideoDao {

	void addVideo(Video video);
	
	void updateVideo(Video video);
	
	//void deleteVideo(List<Long> ids);
	
	void deleteVideo(Selector selector);
	
	List<Video> listVideo(Integer pageIndex);
	
	Integer getCount();
	
	List<Video> listVideoby(Selector selector);
	
	List<Video> searchbyid(AllIds allIds);
	
	Integer getCountby(Selector selector);
}
