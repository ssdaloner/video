package com.zhiyou100.model;

import java.util.List;

public class ListVo {

	private List<Course> listCourses;
	
	private List<Video> listVideo;
	
	private List<Speaker> listSpeaker;
	
	private Integer count;
	
	private Integer pageIndex;

	public ListVo() {
		super();
	}

	@Override
	public String toString() {
		return "ListVo [listCourses=" + listCourses + ", count=" + count + "]";
	}

	public List<Course> getListCourses() {
		return listCourses;
	}

	public void setListCourses(List<Course> listCourses) {
		this.listCourses = listCourses;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Video> getListVideo() {
		return listVideo;
	}

	public void setListVideo(List<Video> listVideo) {
		this.listVideo = listVideo;
	}

	public List<Speaker> getListSpeaker() {
		return listSpeaker;
	}

	public void setListSpeaker(List<Speaker> listSpeaker) {
		this.listSpeaker = listSpeaker;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	
	
}
