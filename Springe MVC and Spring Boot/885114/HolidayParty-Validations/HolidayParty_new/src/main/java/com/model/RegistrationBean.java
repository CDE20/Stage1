package com.model;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component("register")
public class RegistrationBean {

//	@NotBlank(message = "User Name cannot be blank")
	private String userName;

//	@Pattern(regexp = "[\\d]{10}", message = "Contact Number should be of 10 digits/Contact Number should not be blank")
//	@Phone
	private long contactNumber;

//	@NotBlank(message = "Email ID cannot be blank")
//	@Email(message = "Should be a proper email ID format")
	private String emailId;

//	@NotBlank(message = "Confirm Email ID cannot be blank")
//	@Email(message = "Should be a proper email ID format")
	private String confirmEmailId;

//	@AssertTrue(message = "Please agree to the terms and conditions")
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getConfirmEmailId() {
		return confirmEmailId;
	}

	public void setConfirmEmailId(String confirmEmailId) {
		this.confirmEmailId = confirmEmailId;
	}
}
