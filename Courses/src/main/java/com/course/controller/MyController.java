package com.course.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.course.model.ListOfCourse;
import com.course.service.CourseService;


/**
 * 
 * @author 33000014
 *
 */

@RestController
@RequestMapping("/api/v1/education")
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/courses")
	public List<ListOfCourse> getAllCourse() {
		return courseService.getAllCourse();
	}
	
	@GetMapping("/courses/{id}")
	public ListOfCourse getCourse(@PathVariable int id)
	{
		return courseService.getCourse(id);
	}
	
	@PostMapping("/courses")
	public String purchaseCourse(@RequestBody String courseid)
	{
		return courseService.purchaseCourse(courseid);
	}
}
