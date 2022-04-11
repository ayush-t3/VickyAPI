package com.course.service;

import java.util.List;
import java.util.Optional;

import com.course.model.ListOfCourse;

public interface CourseService {

	public List<ListOfCourse> getAllCourse();

	public ListOfCourse getCourse(int id);

	public String purchaseCourse(String courseid);

	

}
