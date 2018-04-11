package com.csimplifyit.talentNest.Service;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csimplifyit.talentNest.DTO.CourseDTO;
import com.csimplifyit.talentNest.DTO.UserDTO_Old;
import com.csimplifyit.talentNest.model.Course;
import com.csimplifyit.talentNest.model.CourseCurriculumLink;
import com.csimplifyit.talentNest.repository.CourseCurriculumLinkRepository;
import com.csimplifyit.talentNest.repository.CourseRepository;
import com.csimplifyit.talentNest.utils.Constant;
import com.csimplifyit.talentNest.utils.UrlResponse;

@Service
public class CourseService {
	
	@Autowired
	CourseCurriculumLinkRepository courseCurriculumLinkRepo;
	
	@Autowired
	CourseRepository courseRepo;
	
	@Autowired
	HttpRequestService httpservice;
	@Autowired
	UrlJsonLoaderService jsonService;

	public JSONObject getUserCourseData(UserDTO_Old userData) {
		JSONObject responseData=new JSONObject();
		JSONParser parser = new JSONParser();
		UrlResponse urlresponse=null;
		try {
		
		if(userData!=null && userData.getToken()!=null && !userData.getToken().isEmpty()) {
			JSONObject Jobobj = jsonService.getJson("getContentFromSP");
			String Joburl = Jobobj.get(Constant.WEB_SERVICE_URL).toString();
			String Jobdata = Jobobj.get(Constant.WEB_SERVICE_DATA).toString();
			String jobinput = String.format(Jobdata,"'"+userData.getToken()+"'",userData.getUserId(),null,null,userData.getUserId(),"3","'getUserCourse'");

			urlresponse = httpservice.callWebService(Joburl, jobinput);
			if(urlresponse.getStatus()!=0) {
				responseData=(JSONObject)parser.parse(urlresponse.getResponse());
			}
			 
			
		}
			}catch(Exception e) {
				e.printStackTrace();
				}
			
			return responseData;
		}
	public JSONObject getUserAssignmentData(UserDTO_Old userData) {
		JSONObject responseData=new JSONObject();
		JSONParser parser = new JSONParser();
		UrlResponse urlresponse=null;
		try {
		
		if(userData!=null && userData.getToken()!=null && !userData.getToken().isEmpty()) {
			JSONObject Jobobj = jsonService.getJson("getContentFromSP");
			String Joburl = Jobobj.get(Constant.WEB_SERVICE_URL).toString();
			String Jobdata = Jobobj.get(Constant.WEB_SERVICE_DATA).toString();
			String jobinput = String.format(Jobdata,"'"+userData.getToken()+"'",userData.getUserId(),null,null,userData.getUserId(),null,"'getUserCourseAssignment'");

			urlresponse = httpservice.callWebService(Joburl, jobinput);
			 responseData=(JSONObject)parser.parse(urlresponse.getResponse());
			
		}
			}catch(Exception e) {
				e.printStackTrace();
				}
			
			return responseData;
		}
	public  JSONObject getCourseDetails(UserDTO_Old userData,String courseId) {
		JSONObject responseData=new JSONObject();
		JSONParser parser = new JSONParser();
		UrlResponse urlresponse=null;
		try {
		
		if(userData!=null && userData.getToken()!=null && !userData.getToken().isEmpty()) {
			JSONObject Jobobj = jsonService.getJson("getContentFromSP");
			String Joburl = Jobobj.get(Constant.WEB_SERVICE_URL).toString();
			String Jobdata = Jobobj.get(Constant.WEB_SERVICE_DATA).toString();
			String jobinput = String.format(Jobdata,"'"+userData.getToken()+"'",userData.getUserId(),null,null,userData.getUserId(),courseId,"'getCourseDetail'");

			urlresponse = httpservice.callWebService(Joburl, jobinput);
			 responseData=(JSONObject)parser.parse(urlresponse.getResponse());
			
		}
			}catch(Exception e) {
				e.printStackTrace();
				}
			
			return responseData;
		}
	private JSONObject getCourseData(UserDTO_Old userData) {
		JSONObject responseData=new JSONObject();
		JSONParser parser = new JSONParser();
		UrlResponse urlresponse=null;
		try {
		
		if(userData!=null && userData.getToken()!=null && !userData.getToken().isEmpty()) {
			JSONObject Jobobj = jsonService.getJson("getContentFromSP");
			String Joburl = Jobobj.get(Constant.WEB_SERVICE_URL).toString();
			String Jobdata = Jobobj.get(Constant.WEB_SERVICE_DATA).toString();
			String jobinput = String.format(Jobdata,"'"+userData.getToken()+"'",userData.getUserId(),null,null,null,null,"'getRunningCourse'");

			urlresponse = httpservice.callWebService(Joburl, jobinput);
			JSONObject jobData=(JSONObject)parser.parse(urlresponse.getResponse());
			responseData.put("jobData",jobData);
		}
			}catch(Exception e) {
				}
			
			return responseData;
		}
	public CourseDTO fetchCourse(Integer curriculumId) {
		
		try {
			CourseDTO dto=new CourseDTO();
			List<CourseCurriculumLink> courseCurriculumLinkList= courseCurriculumLinkRepo.findByCurriculumId(curriculumId);
			if(courseCurriculumLinkList!=null && !courseCurriculumLinkList.isEmpty()  &&  courseCurriculumLinkList.size()>0) {
				List<CourseDTO> dtoList=new ArrayList<CourseDTO>();
				for(CourseCurriculumLink courseCurriculumLink:courseCurriculumLinkList) {
					Course course=courseRepo.getOne(courseCurriculumLink.getCourseId());
					CourseDTO dtodata=fillDTO(course);
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
	private CourseDTO fillDTO(Course course) {
		try {
			CourseDTO dto=new CourseDTO();
			dto.setId(course.getId());
			dto.setName(course.getName());
			dto.setDescription(course.getDescription());
			dto.setDuration(course.getDuration());
			dto.setIsActive(course.getIsActive());
			dto.setMentor(course.getMentor());
			dto.setCollaborativeCompetencyLevel(course.getCollaborativeCompetencyLevel());
			dto.setCommunicativeCompetencyLevel(course.getCommunicativeCompetencyLevel());
			dto.setTechnicalCompetencyLevel(course.getTechnicalCompetencyLevel());
			dto.setSelfgovernanceCompetencyLevel(course.getSelfgovernanceCompetencyLevel());
			return dto;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
