package com.csimplifyit.talentNest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csimplifyit.talentNest.model.AssignmentContentLink;

@Repository
public interface AssignmentContentLinkRepository extends JpaRepository<AssignmentContentLink, Integer> {

}
