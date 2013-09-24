package com.sur.sms.gateway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sur.sms.gateway.dao.EmployeeDao;
import com.sur.sms.gateway.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public void save(Employee employee){
		dao.save(employee);
	}
	
	public Employee find(Employee param){
		Employee employee = dao.find(param);
		return employee;
	}
	
	public List<Employee> getEmployees(){
		return dao.getEmployees();
	}
	
	public List<Employee> getEmployees(int rowid, int pageSize){
		return dao.getEmployees(rowid, pageSize);
	}
	
	public List<Employee> getEmployeesByDepartment(Employee param){
		return dao.getEmployeesByDepartment(param);
	}
	
	public void delete(Employee param){
		dao.delete(param);
	}
}
