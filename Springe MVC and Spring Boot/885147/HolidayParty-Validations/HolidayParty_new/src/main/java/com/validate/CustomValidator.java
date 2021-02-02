package com.validate;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Service
public class CustomValidator implements Validator {

	public void validate(Object arg0, Errors arg1) {

		RegistrationBean registrationBean = (RegistrationBean) arg0;

		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "userName", "arg1.userName", "User Name cannot be blank");
		long phoneNumber = registrationBean.getContactNumber();
		String str = String.valueOf(phoneNumber);

		if (!(str.length() == 10)) {
			arg1.rejectValue("contactNumber", "arg1.contactNumber",
					"Contact Number should be of 10 digits/ Contact Number should not be blank");
		}

		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "emailId", "arg1.emailId", "Email ID cannot be blank");
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "confirmEmailId", "arg1.confirmEmailId",
				"Confirm Email ID cannot be blank");

		if (!(registrationBean.getEmailId().matches("[A-Za-z0-9]+@[A-Za-z0-9]+.com"))) {
			arg1.rejectValue("emailId", "arg1.emailId", "Should be proper a email ID format");
		}

		if (!(registrationBean.getConfirmEmailId().matches("[A-Za-z0-9]+@[A-Za-z0-9]+.com"))) {
			arg1.rejectValue("confirmEmailId", "arg1.confirmEmailId", "Should be a proper email ID format");
		}

		if (registrationBean.getEmailId().matches("[A-Za-z0-9]+@[A-Za-z0-9]+.com")
				&& registrationBean.getConfirmEmailId().matches("[A-Za-z0-9]+@[A-Za-z0-9]+.com")) {
			
			if (!(registrationBean.getConfirmEmailId().equals(registrationBean.getEmailId()))) {
				arg1.rejectValue("confirmEmailId", "arg1.confirmEmailId", "Email and Confirm Email should be same");
			}
		}
		if (!(registrationBean.isStatus())) {
			arg1.rejectValue("status", "arg1.status", "please agree to the terms and conditions");
		}

	}

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
