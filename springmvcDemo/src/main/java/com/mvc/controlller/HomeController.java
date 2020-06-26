package com.mvc.controlller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.model.LoginModel;
import com.mvc.model.StudentModel;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public ModelAndView getIndexPage() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("studentModel", new StudentModel());
		mav.addObject("loginModel", new LoginModel());
		mav.setViewName("index");
		return mav;
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@Valid @ModelAttribute LoginModel loginModel, BindingResult validationResult) {
		ModelAndView mav = new ModelAndView();
		System.out.println(loginModel);
		mav.setViewName("profile");
		return mav;
	}
}
