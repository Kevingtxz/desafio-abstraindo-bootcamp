package com.kevin.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Mentory {
	private static int currentId;
	
	
	private Integer id;
	private String title;
	private String description;
	private LocalDate date;
	

	public Mentory(String title, String description, LocalDate date) {
		super();
		this.id = currentId++;
		this.title = title;
		this.description = description;
		this.date = date;
	}

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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
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
		Mentory other = (Mentory) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Mentoring [id=" + id + ", title=" + title + ", description=" + description + ", date=" + date + "]";
	}
}
