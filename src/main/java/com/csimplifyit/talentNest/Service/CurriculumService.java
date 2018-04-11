package com.csimplifyit.talentNest.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csimplifyit.talentNest.DTO.CurriculumDTO;
import com.csimplifyit.talentNest.DTO.UserData;
import com.csimplifyit.talentNest.model.Curriculum;
import com.csimplifyit.talentNest.model.User;
import com.csimplifyit.talentNest.repository.CurriculumRepository;

@Service
public class CurriculumService {

	@Autowired
	CurriculumRepository curriculumRepo;
	
	@Autowired 
	UserService userService;
	
	public CurriculumDTO fetchCurriculum(Integer id) {
	try {
		
		Optional<Curriculum> curriculumData=curriculumRepo.findById(id);
		if(curriculumData.isPresent()) {
			Curriculum curriculum = curriculumData.get();
			CurriculumDTO dto=fillDto(curriculum);
			return dto;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}	
	private CurriculumDTO fillDto(Curriculum curriculum) {
		try {
			CurriculumDTO dto=new CurriculumDTO();
			dto.setId(curriculum.getId());
			dto.setName(curriculum.getName());
			dto.setDescription(curriculum.getDescription());
			dto.setMentorId(curriculum.getMentorId());
			dto.setDuration(curriculum.getDuration());
			dto.setUserType(curriculum.getUserType());
			dto.setCollaborativeCompetencyLevel(curriculum.getCollaborativeCompetencyLevel());
			dto.setCommunicativeCompetencyLevel(curriculum.getCommunicativeCompetencyLevel());
			dto.setTechnicalCompetencyLevel(curriculum.getTechnicalCompetencyLevel());
			dto.setSelfgovernanceCompetencyLevel(curriculum.getSelfgovernanceCompetencyLevel());
			dto.setIsActive(curriculum.getIsActive());
			
			return dto;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public List<CurriculumDTO>  fetchAllCurriculum() {
		try {
			List<CurriculumDTO> dtoList=new ArrayList<CurriculumDTO>();
			List<Curriculum> curriculumList=curriculumRepo.findAll();
			for(int i=0;i<curriculumList.size();i++) {
				dtoList.add(fillDto(curriculumList.get(i)));
			}
			return dtoList;
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return null;	
	}
	public CurriculumDTO enrollForCurriculum(UserData userData, Integer id) {
		try {
			boolean curriculumExist=curriculumRepo.existsById(id);
			if(curriculumExist) {
				User user=userService.getUser(userData.getUid());
				user.setAssignedCurriculum(id.toString());
				userService.updateUser(user);
				CurriculumDTO dto=new CurriculumDTO();
				dto.setDescription("Curriculum assigned Sucessfully");
				dto.setId(id);
				return dto;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
