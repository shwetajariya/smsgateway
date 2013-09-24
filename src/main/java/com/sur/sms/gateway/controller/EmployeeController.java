package com.sur.sms.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.sur.sms.gateway.common.Status;
import com.sur.sms.gateway.model.Employee;
import com.sur.sms.gateway.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public ModelAndView employee() {
		Employee employee = new Employee();
		return new ModelAndView("employee", "command", employee);
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public ModelAndView employees() {
		List<Employee> result = service.getEmployees();
		return new ModelAndView("employeeList", "employee", result);
	}
	
	@RequestMapping(value = "/employees/{pageNumber}/{pageSize}", method = RequestMethod.GET)
	public ModelAndView employees(@PathVariable("pageNumber") Integer pageNumber,
			@PathVariable("pageSize") Integer pageSize) {
		List<Employee> result = service.getEmployees(pageNumber*pageSize, pageSize);
		return new ModelAndView("employeeList", "employee", result);
	}
	
	@RequestMapping(value = "/employees/{department}", method = RequestMethod.GET)
	public ModelAndView employees(@PathVariable("department") String department) {
		Employee param = new Employee();
		param.setDepartment(department);
		List<Employee> result = service.getEmployeesByDepartment(param);
		return new ModelAndView("employeeList", "employee", result);
	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public String add(@ModelAttribute("SpringWeb") Employee employee,
			ModelMap model) {
		try {
			service.save(employee);
			model.addAttribute("status", Status.SUCCESS);
			model.addAttribute("message", Status.SUCCESS);
		} catch (Exception ex) {
			model.addAttribute("status", Status.ERROR);
			model.addAttribute("message", ex.getMessage());
			model.addAttribute("exception", ex);
		}

		return "result";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.DELETE)
	public String delete(@ModelAttribute("SpringWeb") Employee employee,
			ModelMap model) {
		try {
			service.delete(employee);
			model.addAttribute("status", Status.SUCCESS);
			model.addAttribute("message", Status.SUCCESS);
		} catch (Exception ex) {
			model.addAttribute("status", Status.ERROR);
			model.addAttribute("message", ex.getMessage());
			model.addAttribute("exception", ex);
		}

		return "result";
	}
}
