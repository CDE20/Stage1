package com.validate;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Component
public class CustomValidator implements Validator {

	public void validate(Object target, Errors error) {

		RegistrationBean bean = (RegistrationBean) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(error, "userName", "error.userName", "User Name cannot be blank");

		String contactNumber = String.valueOf(bean.getContactNumber());
		if (contactNumber.length() != 10) {
			error.rejectValue("contactNumber", "error.contactNumber",
					"Conatact Number should be of 10 digits/ Contact Number should not be blank");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(error, "emailId", "error.emailId", "Email ID cannot be blank");

		ValidationUtils.rejectIfEmptyOrWhitespace(error, "confirmEmailId", "error.confirmEmailId",
				"Confirm Email ID cannot be blank");

		if (!(bean.getEmailId().equals(bean.getConfirmEmailId()))) {
			error.rejectValue("emailId", "error.emailId", "Should be proper email ID format");
			error.rejectValue("confirmEmailId", "error.confirmEmailId", "Should be proper email ID format");
		}

		if (!(bean.isStatus())) {
			error.rejectValue("status", "error.status", "please agree to the terms and conditions");
		}
	}

	public boolean supports(Class<?> arg0) {

		return false;
	}

}
