package com.csimplifyit.talentNest.Controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.csimplifyit.talentNest.DTO.UserDTO;
import com.csimplifyit.talentNest.DTO.UserDTO_Old;
import com.csimplifyit.talentNest.DTO.UserData;
import com.csimplifyit.talentNest.Service.CourseService;
import com.csimplifyit.talentNest.Service.HttpRequestService;
import com.csimplifyit.talentNest.Service.LoginService;
import com.csimplifyit.talentNest.Service.UrlJsonLoaderService;
import com.csimplifyit.talentNest.utils.Constant;

@Controller
public class LoginController {
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/login")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }
	@RequestMapping(value="/")
	public String home(@RequestParam(name="name", required=false, defaultValue="Hello") String name, Model model ,HttpSession session) {
		UserData user=session.getAttribute(Constant.SESSION_ATTR_USER)!=null ?(UserData)session.getAttribute(Constant.SESSION_ATTR_USER):null;
		if(user !=null && user.getToken()!=null && !user.getToken().isEmpty()) {
			
			
			if(user.getName() == null || user.getName().isEmpty()) {
				return "profilesetup";
			
			}else {
				return "freshgraduate";
			}
			
		}
		return "home";
		
	}
	@RequestMapping("/loggedIn")
    public String loggedIn(@RequestParam(name="name", required=false, defaultValue="Hello") String name, Model model,HttpSession session) {
		UserData user=session.getAttribute(Constant.SESSION_ATTR_USER)!=null ?(UserData)session.getAttribute(Constant.SESSION_ATTR_USER):null;
		if(user !=null && user.getToken()!=null && !user.getToken().isEmpty()) {
			if(user.getAssignedCurriculum()!=null && !user.getAssignedCurriculum().isEmpty()) {
				model.addAttribute("name", user.getName());
				return "loggedIn";
			}else {
				return "courses";
			}
		}

        return "redirect:";
    }
	
	@RequestMapping("/home")
	public String home(Map<String, Object> model) {
		
		return "home";
	}
	@RequestMapping("/courses")
	public String courses(Map<String, Object> model) {
		
		return "courses";
	}
	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "home";
	}
	@RequestMapping("/index")
	public String index(Map<String, Object> model) {
		
		return "index";
	}
	@RequestMapping("/profilesetup")
	public String profilesetup(Map<String, Object> model) {
		
		return "profilesetup";
	}
	@RequestMapping("/fresh")
	public String fresh(Map<String, Object> model) {
		
		return "freshgraduate";
	}
}
