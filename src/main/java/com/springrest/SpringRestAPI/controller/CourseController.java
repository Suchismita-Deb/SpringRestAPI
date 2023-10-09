package com.springrest.SpringRestAPI.controller;

import com.springrest.SpringRestAPI.entity.Course;
import com.springrest.SpringRestAPI.service.CourseService;
import com.springrest.SpringRestAPI.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Struct;
import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/healthCheck")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable String courseId){
        return this.courseService.getCourseByID(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course postCourse(@RequestBody Course course){
        return this.courseService.postCourse(course);
    }

    @PutMapping("/courses")
    public Course putCourse(@RequestBody Course course){
        return this.courseService.putCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable String courseId){
        return this.courseService.deleteCourse(Long.parseLong(courseId));
    }
}
