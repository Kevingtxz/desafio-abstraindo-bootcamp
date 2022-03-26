package com.kevin.domain;

import java.util.Objects;

public class Course extends Content {

	private final int timeToComplete;

	public Course(String title, String description, int timeToComplete) {
		super(title, description);
		this.timeToComplete = timeToComplete;
	}

	public double calcXP() {
		return Content.STANDARD_COURSE_XP;
	}

	public int getTimeToComplete() {
		return timeToComplete;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getId());
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
		return Objects.equals(this.getId(), other.getId());
	}

	@Override
	public String toString() {
		return "\nCourse [id=" + this.getId() + ", title=" + this.getTitle() + ", description=" + this.getDescription()
				+ ", timeToComplete=" + this.getTimeToComplete() + "]";
	}
}
