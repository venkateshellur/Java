package com.udemylearning.springboot.learnjpaandhibernate.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemylearning.springboot.learnjpaandhibernate.course.SpringJPA.CourseSpringJpaRepo;
import com.udemylearning.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepo;
import com.udemylearning.springboot.learnjpaandhibernate.course.jsbc.CourseJDBCRepo;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	// @Autowired
	// private CourseJDBCRepo repo;

	@Autowired
	private CourseJpaRepo repo;

	@Autowired
	private CourseSpringJpaRepo springRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		//PerformOperationsUsingJdbcOrJpa();
		PerformOperationUsingSpringJPA();
	}

	// The entire behavior will be the same irrespective of we use
	// JDBCRepo or JPARepo which is defined above
	public void PerformOperationsUsingJdbcOrJpa() {
		
		List<Course> courses = List.of(new Course(1, "Skills++", "Venky"), new Course(2, "Management", "Deepika"),
				new Course(3, "Time Management", "Pranav"), new Course(4, "Qucik Learning", "Kishan"),
				new Course(5, "Soft Skills", "Anuj"), new Course(6, "Better Socializing", "Bravo"));

		courses.stream().forEach(x -> repo.insert(x));

		courses.stream().forEach(x -> {
			if (x.getId() == 5) {
				Course course = repo.SelectByID(x.getId());
				System.out.println("The Record about to be deleted is : " + x.toString());
				repo.delete(x);
			}
		});
	}
	
	public void PerformOperationUsingSpringJPA()
	{
		List<Course> courses = List.of(new Course(1, "Skills++", "Venky"), new Course(2, "Management", "Deepika"),
				new Course(3, "Time Management", "Pranav"), new Course(4, "Qucik Learning", "Kishan"),
				new Course(5, "Soft Skills", "Anuj"), new Course(6, "Better Socializing", "Bravo"));

		courses.stream().forEach(x -> springRepo.save(x));

		courses.stream().forEach(x -> {
			if (x.getId() == 5) {
				Optional<Course> course = springRepo.findById(x.getId());
				System.out.println("The Record about to be deleted is : " + course.toString());
				springRepo.delete(x);
			}
		});
		
		System.out.println(springRepo.findAll());
		System.out.println(" SpringRepo Retrieved Record : " +springRepo.findByAuthor("Venky"));
	}
}
