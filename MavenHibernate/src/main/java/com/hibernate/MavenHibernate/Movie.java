package com.hibernate.MavenHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Table;

@Entity
//@Table(name="movie_list")
public class Movie {
	@Id
	private int id;
	private String name;
	private String director;

	public Movie(int id, String name, String director) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
	}

	public Movie() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", director=" + director + "]";
	}

}
