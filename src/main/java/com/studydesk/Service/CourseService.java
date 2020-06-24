package com.studydesk.Service;

import com.studydesk.Model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface CourseService {
    Page<Course> getAllCourses(Pageable pageable);
    Page<Course> getAllTagsByCareerId(Long careerId, Pageable pageable);
    Course getCourseById(Long courseId);
    Course createCourse(Course course);
    Course updateCourse(Long courseId, Course courseDetails);
    ResponseEntity<?> deleteCourses(Long courseId);
}
