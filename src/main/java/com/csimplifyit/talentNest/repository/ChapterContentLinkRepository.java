package com.csimplifyit.talentNest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csimplifyit.talentNest.model.ChapterContentLink;

@Repository
public interface ChapterContentLinkRepository extends JpaRepository<ChapterContentLink, Integer>{

}
