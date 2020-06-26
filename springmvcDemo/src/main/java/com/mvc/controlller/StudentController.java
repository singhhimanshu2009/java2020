package com.mvc.controlller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.model.StudentModel;

@Controller
@RequestMapping(value = "/students")
public class StudentController {
	
	// Method to process the registration request
		@RequestMapping(value = "/signup", method = RequestMethod.POST)
		public ModelAndView register(@Valid @ModelAttribute StudentModel studentModel, BindingResult validationResult) {
			ModelAndView mav = new ModelAndView();
			System.out.println(studentModel);
			mav.setViewName("index");
			return mav;
		}
		
		
		
		

}
