package com.example.StudentApp;

import com.example.StudentApp.Models.Post;
import com.example.StudentApp.Repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Instant;

@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}


	@Bean
	public CommandLineRunner initData(PostRepository postRepository){
		return args -> {
			postRepository.deleteAll();
			for (int i = 1; i <= 5; i++) {
				postRepository.save(new Post(null, "title"+i, "this is title "+i, Instant.now()));
		}
		};
	}

}
