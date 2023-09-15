package com.app.akbar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCloudSchedulerServiceApplication {

	public static void main(String[] args) {
	int a = 10;	SpringApplication.run(SpringCloudSchedulerServiceApplication.class, args);
	}

}
