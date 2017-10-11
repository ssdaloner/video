package com.zhiyou100.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.dao.VideoDao;
import com.zhiyou100.model.AllIds;
import com.zhiyou100.model.Selector;
import com.zhiyou100.model.Video;
import com.zhiyou100.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService{

	@Autowired
	private VideoDao dao;
	
	public void addVideo(Video video) {
		
		dao.addVideo(video);
		
	}

	public void deleteVideo(List<Long> ids) {
		
		Selector selector=new Selector();
		
		selector.setIds(ids);
		
		dao.deleteVideo(selector);
		
	}

	public List<Video> listVideo(Integer pageIndex) {
		
		return dao.listVideo((pageIndex-1)*5);
	}

	public Integer getCount() {
		
		Integer result=(dao.getCount()+4)/5;
		
		return result;
	}

	public List<Video> listVideo(Selector selector) {
		
		Integer result=(dao.getCountby(selector)+4)/5;
		
		selector.setPageIndex(result);
		
		return dao.listVideoby(selector);
	}

	public void updateVideo(Video video) {
		
		
		dao.updateVideo(video);
		
	}

	public Integer getCount(Selector selector) {
		
      Integer result=(dao.getCountby(selector)+4)/5;
		
		return result;
		
	}

	public List<Video> searchbyid(AllIds allIds) {
		
		return dao.searchbyid(allIds);
	}

	

}
