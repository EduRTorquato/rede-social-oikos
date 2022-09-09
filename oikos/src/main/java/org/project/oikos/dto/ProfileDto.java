package org.project.oikos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto {
	
	private String name;
	
	private String alias;
	
	private String email;
	
	private String bio;

	

}
