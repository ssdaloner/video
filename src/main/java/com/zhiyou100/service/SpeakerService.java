package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.Selector;
import com.zhiyou100.model.Speaker;

public interface SpeakerService {

	/**
	 * 添加 讲师
	 * @param speaker
	 */
	void addSpeaker(Speaker speaker);
	/**
	 * 修改讲师内容
	 * @param speaker
	 */
	void  updateSpeaker(Speaker speaker);
	/**
	 * 根据id 删除 讲师
	 * @param ids
	 */
	void deleteSpeaker(List<Long> ids);
	/**
	 * 根据 输入 的页码，获取 讲师数据
	 * @param pageIndex
	 * @return
	 */
	List<Speaker> listSpeaker(Integer pageIndex);
	/**
	 * 获取 总页数
	 * @return
	 */
	Integer getCount();
	/**
	 * 根据查询条件，获取讲师
	 */
	List<Speaker> listSpeakerby(Speaker speaker);
	
	
	Long getId(String name);
	
	
	List<Speaker> listName();
	
}
