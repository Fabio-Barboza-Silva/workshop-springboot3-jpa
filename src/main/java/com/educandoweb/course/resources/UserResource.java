package com.educandoweb.course.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users") 
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User u = new User(1L,"Mariana","maria@gmail.com","99999999","123456");
		User j = new User(2L,"Jose","jose@gmail.com","7777788888","78945612");
		User k = new User(3L,"luisa","luisa@gmail.com","7895613","78945612");
		
		 List<User> users = Arrays.asList(u, j, k);
	     return ResponseEntity.ok().body(users);		
		
	}

}
