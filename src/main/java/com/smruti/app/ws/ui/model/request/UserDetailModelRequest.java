package com.smruti.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailModelRequest {

	@NotNull(message = "Firstname cant be Blank")
	private String firstName;
	
	@NotNull(message = "lastname cant be Blank")
	private String lastName;
	
	@NotNull(message = "Email cant be Blank")
	@Email
	private String email;
	
	@NotNull(message = "password cant be Blank")
	@Size(min = 8, max = 16, message = "Password must be greater tahn 8 and less than 16 leter")
	private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
