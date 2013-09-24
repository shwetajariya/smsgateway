package com.sur.sms.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.sur.sms.gateway.common.Status;
import com.sur.sms.gateway.model.Student;

@Controller
public class StudentController {

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("SpringWeb") Student student,
			ModelMap model) {
		model.addAttribute("status", Status.SUCCESS);
		model.addAttribute("message", Status.SUCCESS);

		return "result";
	}
}
