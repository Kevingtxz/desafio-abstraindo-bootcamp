package com.kevin.domain;

import java.util.Objects;

public class Course {
	private static int currentId;
	
	
	private Integer id;
	private String title;
	private String description;
	private int timeToComplete;
	
	
	public Course(String title, String description, int timeToComplete) {
		super();
		this.id = currentId++;
		this.title = title;
		this.description = description;
		this.timeToComplete = timeToComplete;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTimeToComplete() {
		return timeToComplete;
	}

	public void setTimeToComplete(int timeToComplete) {
		this.timeToComplete = timeToComplete;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", description=" + description + ", timeToComplete="
				+ timeToComplete + "]";
	}
}
