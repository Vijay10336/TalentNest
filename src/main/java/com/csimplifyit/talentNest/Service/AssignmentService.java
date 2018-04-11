package com.csimplifyit.talentNest.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csimplifyit.talentNest.DTO.AssignmentDTO;

import com.csimplifyit.talentNest.model.Assignment;
import com.csimplifyit.talentNest.model.AssignmentUserLink;
import com.csimplifyit.talentNest.model.User;
import com.csimplifyit.talentNest.repository.AssignmentRepository;
import com.csimplifyit.talentNest.repository.AssignmentUserLinkRepository;

@Service
public class AssignmentService {
	
	@Autowired
	AssignmentRepository assigmentRepo;
	
	@Autowired
	AssignmentUserLinkRepository  assignmentUserLinkRepo;
	
	@Autowired
	UserService userService;
	
	public AssignmentDTO fetchUserAssignment(Integer id) {
		try {
			AssignmentDTO dto=new AssignmentDTO();
			List<AssignmentUserLink> assignmentUserLinkList=assignmentUserLinkRepo.findByUserId(id);
			if(assignmentUserLinkList!=null && !assignmentUserLinkList.isEmpty()  &&  assignmentUserLinkList.size()>0) {
				List<AssignmentDTO> dtoList=new ArrayList<AssignmentDTO>();
				for(AssignmentUserLink assignmentUserLink:assignmentUserLinkList) {
					Assignment assignment=assigmentRepo.getOne(assignmentUserLink.getAssignmentId());
					AssignmentDTO dtodata=fillDTO(assignment);
					dtoList.add(dtodata);
				}
				dto.setDtoList(dtoList);
				return dto;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	private AssignmentDTO fillDTO(Assignment assignment) {
		try {
			AssignmentDTO dto=new AssignmentDTO();
			dto.setId(assignment.getId());
			dto.setName(assignment.getName());
			dto.setDescription(assignment.getDescription());
			dto.setDuration(assignment.getDuration());
			dto.setIsActive(assignment.getIsActive());
			if(dto.getIsActive()) {
				dto.setAssignmentStatus("Active");
			}else {
				dto.setAssignmentStatus("InActive");
			}
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Calendar c = Calendar.getInstance();
			c.setTime(assignment.getCreatedDate()); // Now use today date.
			c.add(Calendar.DATE, Integer.parseInt(assignment.getDuration())); // Adding 5 days
			String output = sdf.format(c.getTime());
			dto.setDueDate(output);
			User user=userService.getUser(Integer.parseInt(assignment.getCreatedBy()));
			dto.setCreatedBy(user.getFirstName()+" "+user.getLastName());
			dto.setCollaborativeCompetencyLevel(assignment.getCollaborativeCompetencyLevel());
			dto.setCommunicativeCompetencyLevel(assignment.getCommunicativeCompetencyLevel());
			dto.setTechnicalCompetencyLevel(assignment.getTechnicalCompetencyLevel());
			dto.setSelfgovernanceCompetencyLevel(assignment.getSelfgovernanceCompetencyLevel());
			return dto;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
