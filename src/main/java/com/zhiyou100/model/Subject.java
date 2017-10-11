package com.zhiyou100.model;

public class Subject {

	private Long id;
	
	private String title;
	
	private String image;

	private Long count;
	
	public Subject() {
		super();
	}

	public Subject(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", title=" + title + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	
	
	
}
