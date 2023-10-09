package com.springrest.SpringRestAPI.service;

import com.springrest.SpringRestAPI.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    List<Course> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(8,"Java","Chad","Java Course",3));
        list.add(new Course(9,"Spring","Riddhi","Spring Course",3));
        list.add(new Course(10,"React","Brad","React Course",1));
        list.add(new Course(11,"Node","WebDev","Node Course",1));
        list.add(new Course(12,"Database","Tfq","Database Course",1));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourseByID(long courseId) {
        Course course =null;
        for(Course c:list){
            if(c.getId()==courseId)
            {
                course=c;
                break;
            }
        }
        return course;
    }

    @Override
    public Course postCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course putCourse(Course course) {
        for(Course c:list){
            if(c.getId() == course.getId()){
                c.setId(course.getId());
                c.setDuration(course.getDuration());
                c.setDescription(course.getDescription());
                c.setTitle(course.getTitle());
                c.setInstructor(course.getInstructor());
            }
        }
        return course;
    }

    @Override
    public Course deleteCourse(long courseId) {
        Course course = null;
        for(Course c:list){
            if(c.getId() == courseId){
                course = c;
                list.remove(c);
                break;
            }
        }
        return course;
    }
}
