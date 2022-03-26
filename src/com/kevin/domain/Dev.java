package com.kevin.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private static int currentId;

	private Integer id;
	private String name;
	private Set<Content> contentsSubscribed = new LinkedHashSet<>();
	private Set<Content> contentsFinished = new LinkedHashSet<>();

	public Dev(String name) {
		super();
		this.id = currentId++;
		this.name = name;
	}

	public void subscribeBootcamp(Bootcamp bootcamp) {
		this.contentsSubscribed.addAll(bootcamp.getContents());
		bootcamp.getDevs().add(this);
	}

	public void makeProgress() {
		Optional<Content> content = this.contentsSubscribed.stream().findFirst();
		if (content.isPresent()) {
			this.contentsFinished.add(content.get());
			this.contentsSubscribed.remove(content.get());
		} else
			System.err.println("Você não está matriculado em nenhum conteúdo.");
	}

	public double calcFullXP() {
		return this.contentsFinished.stream().mapToDouble(Content::calcXP).sum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getContentsSubscribed() {
		return contentsSubscribed;
	}

	public void setContentsSubscribed(Set<Content> contentsSubscribed) {
		this.contentsSubscribed = contentsSubscribed;
	}

	public Set<Content> getContentsFinished() {
		return contentsFinished;
	}

	public void setContentsFinished(Set<Content> contentsFinished) {
		this.contentsFinished = contentsFinished;
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
		Dev other = (Dev) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Dev [id=" + id + ", name=" + name + ", \ncontentsSubscribed=" + contentsSubscribed
				+ ", \ncontentsFinished=" + contentsFinished + ", \nTotal XP: " + this.calcFullXP() + "]\n";
	}
}
