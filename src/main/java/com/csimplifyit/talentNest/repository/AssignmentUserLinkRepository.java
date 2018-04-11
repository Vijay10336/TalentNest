package com.csimplifyit.talentNest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csimplifyit.talentNest.model.AssignmentUserLink;


@Repository
public interface AssignmentUserLinkRepository extends JpaRepository<AssignmentUserLink, Integer> {
	
	public List<AssignmentUserLink> findByAssignmentId(Integer id);
	public List<AssignmentUserLink> findByUserId(Integer id);

}
