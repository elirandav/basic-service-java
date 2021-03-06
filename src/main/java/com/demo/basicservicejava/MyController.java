package com.demo.basicservicejava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {
	private RestTemplate restTemplate = new RestTemplate();

	@GetMapping(value = "/basic-java")
	public Boolean rule() {
		String url = "http://localhost:8090/task";
		return restTemplate.getForObject(url, Boolean.TYPE);
	}
}
