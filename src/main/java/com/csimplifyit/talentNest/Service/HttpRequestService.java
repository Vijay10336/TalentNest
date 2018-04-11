package com.csimplifyit.talentNest.Service;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Arrays;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.csimplifyit.talentNest.utils.UrlResponse;

@Service
public class HttpRequestService {

	public UrlResponse callWebService(String url, String params) {
		String result="";
		UrlResponse urlResponse=new UrlResponse();
		try {
		// HttpHeaders
		HttpHeaders headers = new HttpHeaders();

		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		// Request to return JSON format
		headers.setContentType(MediaType.APPLICATION_JSON);

		// HttpEntity<String>: To get result as String.
		HttpEntity<String> entity = new HttpEntity<String>(params, headers);

		// RestTemplate
		RestTemplate restTemplate = new RestTemplate();

		// Send request with GET method, and Headers.
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, entity, String.class);

		 result = response.getBody();
		 if(result!=null && !result.isEmpty()) {
			 urlResponse.setStatus(1);
			 urlResponse.setResponse(result);
		 }else {
			 urlResponse.setStatus(0);
			 urlResponse.setError("No data found");
		 }
			 
		System.out.println(result);
		}catch(ResourceAccessException re) {
			urlResponse.setStatus(0);
			 urlResponse.setError("Error:"+re.getMessage());
			re.printStackTrace();
		}catch(Exception e) {
		e.printStackTrace();
		}
		return urlResponse;
	}
}
