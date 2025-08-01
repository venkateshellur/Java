package com.udemylearning.springboot.learnjpaandhibernate.course.SpringJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import com.udemylearning.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringJpaRepo extends JpaRepository<Course, Long> {

}
