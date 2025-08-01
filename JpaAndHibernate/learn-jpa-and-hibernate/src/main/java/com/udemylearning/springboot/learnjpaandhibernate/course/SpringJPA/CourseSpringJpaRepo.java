package com.udemylearning.springboot.learnjpaandhibernate.course.SpringJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.udemylearning.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringJpaRepo extends JpaRepository<Course, Long> {

	// Custom methods can be implemented like below along with the SpringJPA provided methods
	// Rules to follow : to find by column it must be 'findByColumnName'
	// in below example column name is author, hence findByAuthor
	List<Course> findByAuthor(String author);
	
}
