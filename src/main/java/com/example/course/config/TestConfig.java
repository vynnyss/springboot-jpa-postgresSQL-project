package com.example.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.Order;
import com.example.course.entities.User;
import com.example.course.entities.enums.OrderStatus;
import com.example.course.repositories.OrderRepository;
import com.example.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User u1 = new User(null, "Jane Doe", "Jane@ZZZ.com", "988888888", "123456");
		User u2 = new User(null, "Ellen Joe", "shark@ZZZ.com", "977777777", "123456");
		User u3 = new User(null, "Corin", "corin@ZZZ.com", "977777776", "1234567");
		User u4 = new User(null, "Miyabi@ZZZ.com", "Miyabi", "123123","131241241");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAAYMENT, u1); 
		Order o4 = new Order(null, Instant.parse("2019-07-20T05:42:10Z"), OrderStatus.SHIPPED, u3);
		Order o5 = new Order(null, Instant.parse("2019-07-23T10:21:22Z"), OrderStatus.DELIVERED,u4); 
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4));	
		orderRepository.saveAll(Arrays.asList(o1, o2, o3, o4, o5));
	}
	
	
	
	
	
}
