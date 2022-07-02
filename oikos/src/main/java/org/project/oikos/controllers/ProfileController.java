package org.project.oikos.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.project.oikos.models.Profile;
import org.project.oikos.repositories.ProfileRepository;
import org.project.oikos.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
@CrossOrigin("*")
public class ProfileController {
	
	@Autowired
	private ProfileRepository profileRepo;
	
	@Autowired
	private ProfileService profileSvc;
	
	@GetMapping("/all")
	public ResponseEntity<List<Profile>> getAll()
	{
		return Optional.ofNullable(profileRepo.findAll()).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Profile> getById(@PathVariable long id)
	{
		return profileRepo.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/signup")
	public ResponseEntity<Profile> signup(@Valid @RequestBody Profile profile)
	{
		Optional<?> opt = profileSvc.signup(profile);
		if (opt.isPresent()) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		
		return ResponseEntity.status(HttpStatus.CONFLICT).build();
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id)
	{
		profileRepo.deleteById(id);
	}
	
}
