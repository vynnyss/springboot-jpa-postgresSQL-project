package com.example.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "Jane Doe", "Jane@ZZZ.com", "988888888", "123456");
		User u2 = new User(null, "Ellen Joe", "shark@ZZZ.com", "977777777", "123456");
		User u3 = new User(null, "Corin", "corin@ZZZ.com", "977777776", "1234567");
		User u4 = new User(null, "Miyabi@ZZZ.com", "Miyabi", "123123","131241241");
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));
		
	}
	
	
	
}
