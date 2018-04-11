package com.csimplifyit.talentNest.Controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.csimplifyit.talentNest.Service.UserService;
import com.csimplifyit.talentNest.model.User;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/userFind")
	public ResponseEntity<?> userCreate(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		User user=null;
		try {
		Integer uid=requestBody.get("id")!=null && !requestBody.toString().isEmpty()?Integer.parseInt(requestBody.get("id").toString()):338;
		 user=userService.getUser(uid);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(user);
	}
	@PostMapping("/userCreate")
	public ResponseEntity<?> userFind(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		try {
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok("");
	}
	@PostMapping("/userUpdate")
	public ResponseEntity<?> userUpdate(@Valid @RequestBody JSONObject requestBody, HttpSession session,Errors errors) {
		return ResponseEntity.ok("");
	}
}
