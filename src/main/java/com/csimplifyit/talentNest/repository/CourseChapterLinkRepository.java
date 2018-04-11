package com.csimplifyit.talentNest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csimplifyit.talentNest.model.CourseChapterLink;

@Repository
public interface CourseChapterLinkRepository  extends JpaRepository<CourseChapterLink, Integer> {

}
