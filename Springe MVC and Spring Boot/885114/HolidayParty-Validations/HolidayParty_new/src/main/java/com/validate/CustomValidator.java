package com.validate;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Service
public class CustomValidator implements Validator {

	@Override
	public void validate(Object obj, Errors errors) {

		RegistrationBean bean = (RegistrationBean) obj;
		String userName = bean.getUserName();
		long contactNumber = bean.getContactNumber();
		String emailId = bean.getEmailId();
		String confirmEmailId = bean.getConfirmEmailId();
		boolean status = bean.isStatus();

		String contactNumberString = String.valueOf(contactNumber);
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "erorrs.userName", "User Name cannot be blank");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "contactNumber", "errors.contactNumber",
				"Contact Number should be of 10 digits/ Contact Number should not be blank");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "errors.emailId", "Email ID cannot be blank");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmEmailId", "errors.confirmEmailId", "Confirm Email ID cannot be blank");

// 		if (!emailId.matches("^\\S+@\\S+$")) {
// 			errors.rejectValue("emailId", "errors.emailId", "Should be a proper email ID format");
// 		}

// 		if (!confirmEmailId.matches("^\\S+@\\S+$")) {
// 			errors.rejectValue("confirmEmailId", "errors.confirmEmailId", "Should be a proper email ID format");
// 		}

		if (contactNumberString.length() != 10) {
			errors.rejectValue("contactNumber", "errors.contactNumber",
					"Contact Number should be of 10 digits/Contact Number should not be blank");
		}

		if (!emailId.equals(confirmEmailId)) {
			errors.rejectValue("confirmEmailId", "errors.confirmEmailId", "Email and Confirm Email should be same");
		}

		if (!status) {
			errors.rejectValue("status", "errors.status", "please agree to the terms and conditions");
		}

	}

	@Override
	public boolean supports(Class<?> clazz) {
//		return RegistrationBean.class.equals(clazz);
		return false;
	}
}
