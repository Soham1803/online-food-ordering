package com.example.course_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.course_project.repository.Repository;


@SpringBootApplication
@EnableMongoRepositories

public class CourseProjectApplication {

	@Autowired
	Repository foodRepository;

	public static void main(String[] args) {
		SpringApplication.run(CourseProjectApplication.class, args);
	}

}
