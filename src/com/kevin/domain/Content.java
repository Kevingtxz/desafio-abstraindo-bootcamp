package com.kevin.domain;

public abstract class Content {

	private static int currentId;
	protected static final double STANDARD_COURSE_XP = 200d;
	protected static final double STANDARD_MENTORY_XP = 20d;

	private Integer id = currentId++;
	private String title;
	private String description;

	public Content(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}

	public abstract double calcXP();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
