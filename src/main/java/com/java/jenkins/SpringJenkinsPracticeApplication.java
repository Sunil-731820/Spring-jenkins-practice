package com.java.jenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringJenkinsPracticeApplication {

	Logger logger = LoggerFactory.getILoggerFactory();
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsPracticeApplication.class, args);
	}

}
