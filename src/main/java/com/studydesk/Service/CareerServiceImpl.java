package com.studydesk.Service;

import com.studydesk.Model.Career;
import com.studydesk.repository.CareerRepository;
import com.studydesk.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public class CareerServiceImpl  implements  CareerService{
    @Autowired
    private CareerRepository careerRepository;

    @Autowired
    private CourseRepository courseRepository;


    @Override
    public Career assignCareerCourse(Long careerId, Long courseId) {
        return null;
    }

    @Override
    public Career unassignCareerCourse(Long careerId, Long courseId) {
        return null;
    }

    @Override
    public Page<Career> getAllCareersByCourseId(Long courseId, Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<?> deleteCareer(Long careerId) {
        return null;
    }

    @Override
    public Career updateCareer(Long careerId, Career careerRequest) {
        return null;
    }

    @Override
    public Career createCareer(Career career) {
        return null;
    }

    @Override
    public Career getCareerById(Long careerId) {
        return null;
    }

    @Override
    public Page<Career> getAllCareers(Pageable pageable) {
        return null;
    }
}
