package com.backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.backend.api.models.User;
import com.backend.api.repositories.UserRepository;

@SpringBootApplication
public class ApiApplication 
//implements CommandLineRunner
{

//	private final UserRepository userRepository;
//	
//	@Autowired
//	public ApiApplication(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		if(userRepository.findAll().isEmpty()) {
//			userRepository.save(new User("Manik", "Rawat"));
//			for(User u: userRepository.findAll()) {
//				System.out.println(u);
//			}
//		}
//	}

}
