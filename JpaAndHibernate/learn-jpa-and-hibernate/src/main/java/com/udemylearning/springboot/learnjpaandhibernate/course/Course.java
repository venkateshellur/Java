package com.udemylearning.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private long id;
	
	@Column(name="name")
	private String CourseName;
	
	@Column(name="author")
	private String author;
	
	public Course() {}
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.CourseName = name;
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return CourseName;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.CourseName = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + CourseName + ", author=" + author + "]";
	}
	
	
}
