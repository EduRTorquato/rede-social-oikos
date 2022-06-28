package org.project.oikos.models;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class User implements Serializable
{	
	
	private static final long serialVersionUID = 1454693156247948371L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	
	@NotEmpty(message = "Name field can't be empty. ")
	@Size(min = 3, max = 50, message = "Name needs to be between 8 and 50 characters. ")
	private String userName;
	
	@NotEmpty(message = "Alias field can't be empty. ")
	@Size(min = 3, max = 20, message = "Alias needs to be between 3 and 20 characters. ")
	private String userAlias;
	
	@NotEmpty(message = "Email field can't be empty. ")
	@Email
	private String userEmail;
	
	@NotEmpty(message = "Password field can't be empty. ")
	@Size(min = 8, max = 30, message = "Password needs to be between 8 and 30 characters. ")
	private String userPassword;
	
	@Size(max = 1000, message = "Bio can't be longer than 1000 characters. ")
	private String userBio;
	
}