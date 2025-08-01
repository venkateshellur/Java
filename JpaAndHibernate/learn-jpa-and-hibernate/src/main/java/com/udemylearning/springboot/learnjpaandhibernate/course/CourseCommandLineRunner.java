package com.udemylearning.springboot.learnjpaandhibernate.course.jsbc;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.udemylearning.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJDBCCmdLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJDBCRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Course> courses = List.of(new Course(1,"Skills++","Venky"),
									   new Course(2,"Management","Deepika"),
									   new Course(3,"Time Management","Pranav"),
									   new Course(4,"Qucik Learning","Kishan"),
									   new Course(5,"Soft Skills","Anuj"),
									   new Course(6,"Better Socializing","Bravo"));
		courses.stream().forEach(x -> repo.insert(x));
		
		courses.stream().forEach(x -> {
			if(x.getId() == 5)
			{
				Course course = repo.SelectByID(x.getId());
				System.out.println("The Record about to be deleted is : "+ x.toString());
				repo.delete(x);
			}
		});
		;
	}

}
