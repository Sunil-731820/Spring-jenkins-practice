package com.java.jenkins;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringJenkinsPracticeApplication {

	org.slf4j.Logger log = LoggerFactory.getLogger(SpringJenkinsPracticeApplication.class);
	public static void main(String[] args) {
		
		
		SpringApplication.run(SpringJenkinsPracticeApplication.class, args);
		System.out.println("This is the Example Of The Jenkins ");
		System.out.println("This is the Example Of The Jenkins ");
		System.out.println("This is the Example Of The Jenkins ");
	}

}
