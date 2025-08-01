package com.udemylearning.springboot.learnjpaandhibernate.course.jsbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.udemylearning.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJDBCRepo {
	
	@Autowired
	private JdbcTemplate springJDBCTemplate;
	
	private static String INSERT_QUERY = """
			insert into COURSE (id, name, author) values(?,?,?);
			""";
	
	private static String DELETE_QUERY = """
			DELETE FROM COURSE WHERE id = ?
			""";
	
	
	private static String SELECT_BYID = """
			SELECT * FROM COURSE WHERE ID = ?
			""";
	
	public void insert(Course course) {
		springJDBCTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void delete(Course course)
	{
		springJDBCTemplate.update(DELETE_QUERY, course.getId());
	}
	
	public Course SelectByID(long id)
	{
		return springJDBCTemplate.queryForObject(SELECT_BYID, new BeanPropertyRowMapper<>(Course.class), id);
	}
}
