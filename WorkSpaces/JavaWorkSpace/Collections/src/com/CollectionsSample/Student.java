package com.CollectionsSample;

import java.util.Comparator;

class AscendingStudentComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.getId(), s2.getId());
	}
}

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "\n The student ID : " + id + " holds the record of student named : " + name;
	}

	@Override
	public int compareTo(Student that) {
		// return Integer.compare(this.id, that.id); // This comparision returns
		// Ascending order
		return Integer.compare(this.id, that.id); // While this comparision returns the descending order - Difference is
													// interchange in the parameter passed.
	}
}
