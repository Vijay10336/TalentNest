package com.csimplifyit.talentNest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csimplifyit.talentNest.model.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {

}
