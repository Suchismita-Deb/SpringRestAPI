package com.springrest.SpringRestAPI.service;

import com.springrest.SpringRestAPI.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourseByID(long courseId);

    public Course postCourse(Course course);

    public Course putCourse(Course course);

    public Course deleteCourse(long courseId);
}
