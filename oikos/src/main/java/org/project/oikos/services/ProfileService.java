package org.project.oikos.services;

import java.util.Optional;

import org.project.oikos.models.Profile;
import org.project.oikos.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
	
	@Autowired
	ProfileRepository profileRepo;
	
	public Optional<?> signup(Profile profile)
	{
		return profileRepo.findByAliasOrEmailIgnoreCase(profile.getAlias(), profile.getEmail()).map(opt -> {
			return Optional.empty();
		}).orElseGet(() -> {
			return Optional.ofNullable(profileRepo.save(profile));
		});
	}

}
