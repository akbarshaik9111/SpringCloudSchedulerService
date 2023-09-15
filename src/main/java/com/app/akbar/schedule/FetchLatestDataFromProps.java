package com.app.akbar.schedule;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class FetchLatestDataFromProps {
	
	@Scheduled(cron = "*/10 * * * * *")
	public void fetch() {
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> entity = new HttpEntity<>("{}", headers);
		
		RestTemplate rt = new RestTemplate();
		String url = "http://192.168.1.7:8082/actuator/refresh";
		rt.postForEntity(url, entity, String.class);
	}

}
