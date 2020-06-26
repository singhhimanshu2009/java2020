package com.mvc.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mvc.model.StudentModel;

@Component
public class MailValidator implements Validator
{
	
	@Override
	public boolean supports(Class<?> cl) {
		
		return cl.equals(StudentModel.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		
	}

	

}
