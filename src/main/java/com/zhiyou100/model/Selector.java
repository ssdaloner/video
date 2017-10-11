package com.zhiyou100.model;

import java.util.List;

public class Selector {

	private Course course;
	
	private Speaker speaker;
	
	private Subject subject;
	
	private Video video;
	
	private String speakername;
	
	private String coursetitle;
	
	private String videoname;

	private List<Long> ids;
	
	private Integer pageIndex;
	
	public Selector() {
		super();
	}

	@Override
	public String toString() {
		return "Selector [course=" + course + ", speaker=" + speaker + ", subject=" + subject + ", video=" + video
				+ "]";
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getSpeakername() {
		return speakername;
	}

	public void setSpeakername(String speakername) {
		this.speakername = speakername;
	}

	public String getCoursetitle() {
		return coursetitle;
	}

	public void setCoursetitle(String coursetitle) {
		this.coursetitle = coursetitle;
	}

	public String getVideoname() {
		return videoname;
	}

	public void setVideoname(String videoname) {
		this.videoname = videoname;
	}
	
	
}
