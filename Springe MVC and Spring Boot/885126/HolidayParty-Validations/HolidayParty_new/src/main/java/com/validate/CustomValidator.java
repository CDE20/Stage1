package com.validate;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.model.RegistrationBean;
@Component
public class CustomValidator implements Validator{

	
	public void validate(Object obj, Errors error) {
		
		RegistrationBean registorBean=(RegistrationBean)obj;
		ValidationUtils.rejectIfEmptyOrWhitespace(error,"userName","error.userName","User Name cannot be blank");
		long phone=registorBean.getContactNumber();
		String str=String.valueOf(phone);
		if(!(str.length()==10))
		{
			error.rejectValue("contactNumber","error.contactNumber","Conatact Number should be of 10 digits/ Contact Number should not be blank");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(error,"emailId","error.emailId","Email ID cannot be blank");
		ValidationUtils.rejectIfEmptyOrWhitespace(error,"confirmEmailId","error.confirmEmailId","Confirm Email ID cannot be blank");
		if(!(registorBean.getConfirmEmailId().equals(registorBean.getEmailId())))
		{
			error.rejectValue("emailId","error.emailId","Should be proper email ID format");
			error.rejectValue("confirmEmailId", "confirmEmailId", "Should be proper email ID format");
		}
		if(!(registorBean.isStatus()))
		{
			error.rejectValue("status","error.status","please agree to the terms and conditions");
		}
	
	}	 	  	    	    	     	      	 	

	public boolean supports(Class<?> arg0) {
		
		return false;
	}
	

}
