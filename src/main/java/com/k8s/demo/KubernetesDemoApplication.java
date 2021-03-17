package com.k8s.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties
@RefreshScope
public class KubernetesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesDemoApplication.class, args);
	}

}
