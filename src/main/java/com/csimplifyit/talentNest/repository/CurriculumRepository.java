package com.csimplifyit.talentNest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csimplifyit.talentNest.model.Curriculum;


@Repository
public interface CurriculumRepository extends JpaRepository<Curriculum, Integer> {
}
