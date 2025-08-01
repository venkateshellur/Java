package com.UdemyLearning.learnSpringBoot.Courses.Bean;

public class Course {
	
	private long id;
	private String coursename;
	private String authorName;
	
	public Course(long id, String coursename, String authorName) {
		super();
		this.id = id;
		this.coursename = coursename;
		this.authorName = authorName;
	}

	
	
	public long getId() {
		return id;
	}



	public String getCoursename() {
		return coursename;
	}



	public String getAuthorName() {
		return authorName;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", authorName=" + authorName + "]";
	}
}