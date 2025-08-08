package com.corso.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
	@GetMapping("/api/users")
	public List<UserModel> getUsers() {
		return Arrays.asList(new UserModel(1, "Studenti", Arrays.asList("Luca", "Margo"), 32),
				new UserModel(2, "Studenti", Arrays.asList("Anna", "Marco"), 28),
				new UserModel(3, "Studenti", Arrays.asList("Sara", "Luca"), 35)

		);
	}

}
