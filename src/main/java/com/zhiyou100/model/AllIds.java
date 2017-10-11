package com.zhiyou100.model;

public class AllIds {

	
	
	private Long courseId;
	
	private Long speakerId;
	
	private String videoTitle;

	public AllIds() {
		super();
	}

	@Override
	public String toString() {
		return "AllIds [courseId=" + courseId + ", speakerId=" + speakerId + ", videoTitle=" + videoTitle + "]";
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getSpeakerId() {
		return speakerId;
	}

	public void setSpeakerId(Long speakerId) {
		this.speakerId = speakerId;
	}

	public String getVideoTitle() {
		return videoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		this.videoTitle = videoTitle;
	}

}
