package org.project.oikos.controllers;

import org.project.oikos.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class ProfileController {
	
	@Autowired
	private ProfileRepository profileRepo;
	
}
