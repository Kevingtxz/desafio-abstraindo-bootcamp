package com.kevin.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

	private static int currentId;

	private Integer id;
	private String name;
	private String description;
	private final LocalDate startDate = LocalDate.now();
	private final LocalDate finalDate;
	private Set<Dev> devs = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();

	public Bootcamp(String name, String description, int daysToFinish) {
		super();
		this.id = currentId++;
		this.name = name;
		this.description = description;
		this.finalDate = startDate.plusDays(daysToFinish);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Dev> getDevs() {
		return devs;
	}

	public Set<Content> getContents() {
		return contents;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getFinalDate() {
		return finalDate;
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
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Bootcamp [id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate
				+ ", finalDate=" + finalDate + ", devs=" + devs + ", contents=" + contents + "]";
	}
}
