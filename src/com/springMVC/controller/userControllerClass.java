package com.springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springMVC.model.UserClass;

@Controller
@RequestMapping(value= {"/","/home"},method = RequestMethod.GET)
public class userControllerClass {

	@Autowired
	public UserClass user;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView registerForm() {
		return new ModelAndView("registrationForm");
	}
	
	@RequestMapping(value = "/registerSuccess", method = RequestMethod.POST)
	public ModelAndView success(@RequestParam String name, @RequestParam(name="email",required=true,defaultValue="example@gmail.com") String email,  @RequestParam(name="age", required=true) int age, @RequestParam String country) {
		user.setAge(age);
		user.setCountry(country);
		user.setEmail(email);
		user.setName(name);
		ModelAndView model = new ModelAndView("successPage");
		model.addObject("userMessage",user);
		return model;
	}
}
