package com.example.TestTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.TestTwo")
public class TestTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestTwoApplication.class, args);
	}

}
