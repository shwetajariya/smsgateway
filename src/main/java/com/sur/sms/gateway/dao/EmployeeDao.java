package com.sur.sms.gateway.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sur.sms.gateway.model.Employee;

@Repository
public class EmployeeDao {

    @PersistenceContext
    EntityManager em;

    @Transactional
    public void save(Employee employee) {
	System.out.println("save() - " + employee.toString());
	em.persist(employee);
	em.flush();
    }

    public Employee find(Employee param) {
	Employee employee = em.find(Employee.class, param.getId());
	return employee;
    }

    @SuppressWarnings("unchecked")
    public List<Employee> getEmployees() {
	return em.createQuery("SELECT e FROM Employee e").getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Employee> getEmployees(int rowid, int pageSize) {
	String sql = String.format(
		"SELECT e FROM Employee e where rowid >= {} and rowid < {}",
		rowid, rowid + pageSize);
	return em.createQuery(sql).getResultList();
    }

    @SuppressWarnings("unchecked")
    public List<Employee> getEmployeesByDepartment(Employee param) {
	String sql = String.format(
		"SELECT e FROM Employee e where e.department = '{}'",
		param.getDepartment());
	return em.createQuery(sql).getResultList();
    }

    @Transactional
    public void delete(Employee param) {
	Employee employee = em.find(Employee.class, param);
	em.remove(employee);
	em.flush();
    }
}
