package com.udemylearning.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.udemylearning.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course)
	{
		entityManager.merge(course);
	}
	
	public Course SelectByID(long id)
	{
		return entityManager.find(Course.class, id);
	}
	
	public void delete(Course c)
	{
		Course course = entityManager.find(Course.class, c.getId());
		entityManager.remove(course);
	}
}
