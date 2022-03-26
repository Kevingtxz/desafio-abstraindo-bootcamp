package com.kevin.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Mentory extends Content {

	private LocalDate date;

	public Mentory(String title, String description, LocalDate date) {
		super(title, description);
		this.date = date;
	}

	public double calcXP() {
		return Content.STANDARD_MENTORY_XP;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
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
		Mentory other = (Mentory) obj;
		return Objects.equals(this.getId(), other.getId());
	}

	@Override
	public String toString() {
		return "\nMentoring [id=" + this.getId() + ", title=" + this.getTitle() + ", description="
				+ this.getDescription() + ", date=" + this.getDate() + "]";
	}
}
