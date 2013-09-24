package com.sur.sms.gateway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sur.sms.gateway.dao.EmployeeDao;
import com.sur.sms.gateway.model.Employee;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public void save(Employee employee) {
	employeeDao.save(employee);
    }

    public Employee find(Employee param) {
	Employee employee = employeeDao.find(param);
	return employee;
    }

    public List<Employee> getEmployees() {
	return employeeDao.getEmployees();
    }

    public List<Employee> getEmployees(int rowid, int pageSize) {
	return employeeDao.getEmployees(rowid, pageSize);
    }

    public List<Employee> getEmployeesByDepartment(Employee param) {
	return employeeDao.getEmployeesByDepartment(param);
    }

    public void delete(Employee param) {
	employeeDao.delete(param);
    }
}
