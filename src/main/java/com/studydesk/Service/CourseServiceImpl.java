package com.studydesk.Service;

import com.studydesk.Model.Course;
import com.studydesk.repository.CareerRepository;
import com.studydesk.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public class CourseServiceImpl implements  CourseService{

    @Autowired
    private CareerRepository careerRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Page<Course> getAllCourses(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Course> getAllTagsByCareerId(Long careerId, Pageable pageable) {
        return null;
    }

    @Override
    public Course getCourseById(Long courseId) {
        return null;
    }

    @Override
    public Course createCourse(Course course) {
        return null;
    }

    @Override
    public Course updateCourse(Long courseId, Course courseDetails) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteCourses(Long courseId) {
        return null;
    }
}
