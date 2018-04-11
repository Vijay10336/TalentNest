package com.csimplifyit.talentNest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csimplifyit.talentNest.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
