package com.example.demoehcache;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoEhcacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEhcacheApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StudentService service) {
		return args -> {
			System.out.println(service.getStudentById(1));
			System.out.println(service.getStudentById(2));
			System.out.println(service.getStudentById(3));
		};
	}
}
