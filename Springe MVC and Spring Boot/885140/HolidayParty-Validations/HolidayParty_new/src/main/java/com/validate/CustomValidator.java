package com.validate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;

@Component
public class CustomValidator implements Validator{

	
	public void validate(Object obj, Errors error) {
		
		RegistrationBean bean = (RegistrationBean) obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "userName", "error.userName","User Name cannot be blank");
		
		long phoneNumer = bean.getContactNumber();
		String contactNumber = Long.toString(phoneNumer);
		if(contactNumber.length()!=10) {
			error.rejectValue("contactNumber", "error.contactNumber", "Contact Number should be of 10 digits/Contact Number should not be blank");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "emailId", "error.emailId","EmailID cannot be blank");
		ValidationUtils.rejectIfEmptyOrWhitespace(error, "confirmEmailId", "error.confirmEmailId","Confirm EmailID cannot be blank");
		
		if(!bean.getEmailId().equals(bean.getConfirmEmailId())) {
			error.rejectValue("emailId","error.emailId","Should be proper email ID format");
			error.rejectValue("confirmEmailId","error.confirmEmailId","Should be proper email ID format");
		}
		
		if(!bean.isStatus()) {
			error.rejectValue("status","error.status", "Please agree to the terms and conditions");
		}

	
	}	 	  	    	    	     	      	 	

	public boolean supports(Class<?> arg0) {
		return false;
	}
	

}
