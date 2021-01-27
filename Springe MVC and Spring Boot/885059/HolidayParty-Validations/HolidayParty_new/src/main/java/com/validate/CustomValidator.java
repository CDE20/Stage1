package com.validate;

import com.model.RegistrationBean;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.validation.ValidationUtils;
import org.springframework.stereotype.Component;


@Component
public class CustomValidator implements Validator{

	
	public void validate(Object arg0, Errors arg1) {
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "userName", "error.userName", "User Name cannot be blank");
        ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "emailId", "error.emailId", "Email ID cannot be blank");
        ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "confirmEmailId", "error.confirmEmailId", "Confirm Email ID cannot be blank");
		
		RegistrationBean r=(RegistrationBean) arg0;
		if(!r.isStatus()){
		    arg1.reject("status", "please agree to the terms and conditions");
		}
		int l=String.valueOf(r.getContactNumber()).length();
		if(l!=10 || String.valueOf(l)==""){
		    arg1.rejectValue("contactNumber","Contact Number should be of 10 digits/Contact Number should not be blank");
		}
		if(!(r.getEmailId().equals(r.getConfirmEmailId()))){
		    arg1.rejectValue("confirmEmailId","Email and Confirm Email should be same");
		}
		if(!r.getEmailId().contains("@")) {
		    arg1.rejectValue("emailId","error.emailId","Should be proper email ID format");
		}
		if(!r.getConfirmEmailId().contains("@")){
		    arg1.rejectValue("confirmEmailId","error.confirmEmailId","Should be proper email ID format"); 
		}
	
	}	 	  	    	    	     	      	 	

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return RegistrationBean.class.isAssignableFrom(arg0);
	}
	

}
