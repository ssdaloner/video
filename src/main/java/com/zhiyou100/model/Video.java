package com.zhiyou100.model;

import java.util.Date;

public class Video {

	private Long id;
	
	private String name;
	
	private String descriptor;
	
	private Long courseId;
	
	private Long speakerId;
	
	private Integer duration;
	
	private Integer videoview;
	
	private String image;
	
	private String courseTitle;
	
	private String url;
	
	private Integer pageCount;
	
	private String speakerName;
	
	private Date createTime;

	public Video() {
		super();
	}

	@Override
	public String toString() {
		return "Video [id=" + id + ", name=" + name + ", descriptor=" + descriptor + ", courseId=" + courseId
				+ ", speakerId=" + speakerId + ", duration=" + duration + ", videoview=" + videoview + ", image="
				+ image + ", url=" + url + ", Count=" + pageCount + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Integer getVideoview() {
		return videoview;
	}

	public void setVideoview(Integer videoview) {
		this.videoview = videoview;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSpeakerName() {
		return speakerName;
	}

	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}

	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}


	
	
}
