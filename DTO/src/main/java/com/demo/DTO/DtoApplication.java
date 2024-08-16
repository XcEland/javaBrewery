package com.demo.DTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demo.DTO.model.Location;
import com.demo.DTO.model.User;
import com.demo.DTO.repository.LocationRepository;
import com.demo.DTO.repository.UserRepository;

@SpringBootApplication
public class DtoApplication implements CommandLineRunner{

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(DtoApplication.class, args);

	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception{
		Location location = new Location();
		location.setPlace("Beitbridge");
		location.setDescription("BB is really hot");												
		location.setLongitude(29.8);
		location.setLatitude(17.8);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("Mconals");
		user1.setLastName("Mpofu");
		user1.setEmail("mc@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Andrew");
		user2.setLastName("Dawns");
		user2.setEmail("dawns@gmail.com");
		user2.setPassword("secret2");
		user2.setLocation(location);
		userRepository.save(user2);
	}




}
