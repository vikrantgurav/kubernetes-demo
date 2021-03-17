package com.k8s.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class KubernetesDemoController {

	@Value("${sample.message}")
	private String sampleMessage;
	
	
	private static final Logger log = LoggerFactory.getLogger(KubernetesDemoController.class);


	@GetMapping("/message")
	public ResponseEntity<String> getMessage() {
		log.info("Message: {}",sampleMessage);
		return ResponseEntity.ok(sampleMessage);
	}

}
