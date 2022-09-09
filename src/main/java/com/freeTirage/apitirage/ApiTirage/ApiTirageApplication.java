package com.freeTirage.apitirage.ApiTirage;

import com.freeTirage.apitirage.ApiTirage.models.User;
import com.freeTirage.apitirage.ApiTirage.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTirageApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiTirageApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User(1L,"Mary", "TRAORE", "mary@gmail.com"));
		this.userRepository.save(new User(2L,"Mary", "TRAORE", "mary@gmail.com"));
		this.userRepository.save(new User(3L,"Mary", "TRAORE", "mary@gmail.com"));
	}
}
