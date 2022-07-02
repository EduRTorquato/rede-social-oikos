package org.project.oikos.models;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.project.oikos.models.enums.ProfileType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
public class Profile implements Serializable
{	
	
	private static final long serialVersionUID = 1454693156247948371L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profile_id", nullable = false)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "profile_type", length = 10)
	private ProfileType type;
	
	@NotEmpty(message = "Name field can't be empty. ")
	@Size(min = 3, max = 50, message = "Name needs to be between 3 and 50 characters. ")
	@Column(name = "profile_name", nullable = false)
	private String name;
	
	@NotEmpty(message = "Alias field can't be empty. ")
	@Size(min = 3, max = 20, message = "Alias needs to be between 3 and 20 characters. ")
	@Column(name = "profile_alias", nullable = false, unique = true)
	private String alias;
	
	@NotEmpty(message = "Email field can't be empty. ")
	@Email
	@Column(name = "profile_email", nullable = false, unique = true, length = 50)
	private String email;
	
	@NotEmpty(message = "Password field can't be empty. ")
	@Size(min = 8, max = 30, message = "Password needs to be between 8 and 30 characters. ")
	@Column(name = "profile_password", nullable = false)
	private String password;
	
    @Temporal(TemporalType.DATE)
    @Column(name = "profile_birthday")
    private Date birthday;
	
	@Size(max = 1000, message = "Bio can't be longer than 1000 characters. ")
	@Column(name = "profile_bio")
	private String bio;
	
}