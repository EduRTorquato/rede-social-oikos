package org.project.oikos.mappers;

import org.project.oikos.dto.ProfileDto;
import org.project.oikos.models.Profile;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class
ProfileMapper {

	public static ProfileDto toDto(Profile profile) {
		return ProfileDto.builder()
				.name(profile.getName())
				.alias(profile.getAlias())
				.email(profile.getEmail())
				.bio(profile.getBio())
				.build();
	}
}
