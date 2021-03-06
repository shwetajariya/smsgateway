package com.sur.sms.gateway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sur.sms.gateway.common.Status;
import com.sur.sms.gateway.model.Employee;
import com.sur.sms.gateway.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView indexPage() {
	Employee employee = new Employee();
	return new ModelAndView("employee", "command", employee);
    }

    @RequestMapping(value = "/viewEmployee", method = RequestMethod.GET)
    public String viewEmployee(ModelMap model) {
	List<Employee> employeeList = employeeService.getEmployees();
	model.addAttribute("employeeList", employeeList);
	return "employeeList";
	// return new ModelAndView("employeeList", "command", employeeList);
    }

    @RequestMapping(value = "/sendSms", method = RequestMethod.GET)
    public ModelAndView sendSms() {
	Employee employee = new Employee();
	return new ModelAndView("sendSms", "command", employee);
	// return new ModelAndView("employeeList", "command", employeeList);
    }

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView employee() {
	Employee employee = new Employee();
	return new ModelAndView("employee", "command", employee);
    }

    @RequestMapping(value = "/sendSmsAll", method = RequestMethod.GET)
    public String sendSmsOne() {
	System.out.println("==============sendSmsAll");
	return "result";
    }

    @RequestMapping(value = "/sendSmsOne", method = RequestMethod.POST)
    public String sendSmsOne(@ModelAttribute("SpringWeb") Employee employee,
	    ModelMap model) {
	try {
	    System.out.println("sendSms == " + employee.getFirstNumber()
		    + employee.getMiddleNumber() + employee.getLastNumber());
	    model.addAttribute("status", Status.SUCCESS);
	    model.addAttribute("message", Status.SUCCESS);
	} catch (Exception ex) {
	    model.addAttribute("status", Status.ERROR);
	    model.addAttribute("message", ex.getMessage());
	    model.addAttribute("exception", ex);
	}

	return "result";
    }

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public ModelAndView employees() {
	List<Employee> result = employeeService.getEmployees();
	return new ModelAndView("employeeList", "employee", result);
    }

    @RequestMapping(value = "/employees/{pageNumber}/{pageSize}", method = RequestMethod.GET)
    public ModelAndView employees(
	    @PathVariable("pageNumber") Integer pageNumber,
	    @PathVariable("pageSize") Integer pageSize) {
	List<Employee> result = employeeService.getEmployees(pageNumber
		* pageSize, pageSize);
	return new ModelAndView("employeeList", "employee", result);
    }

    @RequestMapping(value = "/employees/{department}", method = RequestMethod.GET)
    public ModelAndView employees(@PathVariable("department") String department) {
	Employee param = new Employee();
	param.setDepartment(department);
	List<Employee> result = employeeService.getEmployeesByDepartment(param);
	return new ModelAndView("employeeList", "employee", result);
    }

    @RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String add(@ModelAttribute("SpringWeb") Employee employee,
	    ModelMap model) {
	try {
	    employeeService.save(employee);
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
	    employeeService.delete(employee);
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
