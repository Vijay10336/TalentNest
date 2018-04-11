package com.csimplifyit.talentNest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csimplifyit.talentNest.model.CourseCurriculumLink;

@Repository
public interface CourseCurriculumLinkRepository  extends JpaRepository<CourseCurriculumLink, Integer>{
	public List<CourseCurriculumLink> findByCurriculumId(Integer id);

}
