package com.zhiyou100.model;

public class Speaker {

	private Long id;
	
	private String name;
	
	private String position;
	
	private String icon;
	
	private String descriptor;

	private Integer count;
	
	public Speaker() {
		super();
	}

	@Override
	public String toString() {
		return "Speaker [id=" + id + ", name=" + name + ", position=" + position + ", icon=" + icon + ", descriptor="
				+ descriptor + "]";
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescriptor() {
		return descriptor;
	}

	public void setDescriptor(String descriptor) {
		this.descriptor = descriptor;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	
}
