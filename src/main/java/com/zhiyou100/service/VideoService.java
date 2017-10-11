package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.AllIds;
import com.zhiyou100.model.Selector;
import com.zhiyou100.model.Video;

public interface VideoService {

	/**
	 * 添加视频
	 * @param video
	 */
	void addVideo(Video video);
	/**
	 * 修改视频
	 * @param video
	 */
	void updateVideo(Video video);
	/**
	 * 删除 视频
	 * @param ids
	 */
	void deleteVideo(List<Long> ids);
	/**
	 * 获取指定页数的 视频
	 * @param pageIndex
	 * @return
	 */
	List<Video> listVideo(Integer pageIndex);
	/**
	 * 分的总页数
	 * @return
	 */
	Integer getCount();
	
	
	List<Video> listVideo(Selector selector);
	/**
	 * 获取条件查询的总页数
	 * @param selector
	 * @return
	 */
	Integer getCount(Selector selector);
	
	List<Video> searchbyid(AllIds allIds);
	
	
}
