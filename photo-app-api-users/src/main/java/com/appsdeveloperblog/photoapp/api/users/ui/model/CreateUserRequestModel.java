package com.appsdeveloperblog.photoapp.api.users.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateUserRequestModel {
	
	@NotNull(message = "First name cannot be null")
	@Size(min = 2,message = "First name can not be less than 2 characters")
	private String firstName;
	@NotNull(message = "Last name cannot be null")
	@Size(min = 2,message = "Last name can not be less than 2 characters")
	private String lastName;
	
	@NotNull(message = "Password name cannot be null")
	@Size(min = 8,max = 16, message = "Password should be between 8 and 16 characters")
	private String password;
	
	@Email
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}