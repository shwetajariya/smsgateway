package com.sur.sms.gateway.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private java.lang.Integer id;
	@NotNull
	private java.lang.Integer employeeNumber;
	@NotNull
	private java.lang.String firstName;
	@NotNull
	private java.lang.String lastName;
	@NotNull
	private java.lang.String company;
	@NotNull
	private java.lang.String designation;
	@NotNull
	private java.lang.String department;
	private java.lang.String section;
	@NotNull
	@Pattern(regexp="^\\d{10}$",
    message="{invalid.phonenumber}")
	private java.lang.String mobileNumber;
	private java.lang.String ipContactNumber;
	@NotNull
	private java.lang.String priority;
	@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
	        +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
	        +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
	             message="{invalid.email}")
	private java.lang.String email;
	private java.lang.String address;
	private java.lang.String area;

	public java.lang.Integer getId() {
		return id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(java.lang.Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public java.lang.String getFirstName() {
		return firstName;
	}

	public void setFirstName(java.lang.String firstName) {
		this.firstName = firstName;
	}

	public java.lang.String getLastName() {
		return lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.lang.String getCompany() {
		return company;
	}

	public void setCompany(java.lang.String company) {
		this.company = company;
	}

	public java.lang.String getDesignation() {
		return designation;
	}

	public void setDesignation(java.lang.String designation) {
		this.designation = designation;
	}

	public java.lang.String getDepartment() {
		return department;
	}

	public void setDepartment(java.lang.String department) {
		this.department = department;
	}

	public java.lang.String getSection() {
		return section;
	}

	public void setSection(java.lang.String section) {
		this.section = section;
	}

	public java.lang.String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(java.lang.String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public java.lang.String getIpContactNumber() {
		return ipContactNumber;
	}

	public void setIpContactNumber(java.lang.String ipContactNumber) {
		this.ipContactNumber = ipContactNumber;
	}

	public java.lang.String getPriority() {
		return priority;
	}

	public void setPriority(java.lang.String priority) {
		this.priority = priority;
	}

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getAddress() {
		return address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public java.lang.String getArea() {
		return area;
	}

	public void setArea(java.lang.String area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((employeeNumber == null) ? 0 : employeeNumber.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeNumber == null) {
			if (other.employeeNumber != null)
				return false;
		} else if (!employeeNumber.equals(other.employeeNumber))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeNumber=" + employeeNumber
				+ ", firstName=" + firstName + ", lastName=" + lastName
				+ ", company=" + company + ", designation=" + designation
				+ ", department=" + department + ", section=" + section
				+ ", mobileNumber=" + mobileNumber + ", ipContactNumber="
				+ ipContactNumber + ", priority=" + priority + ", email="
				+ email + ", address=" + address + ", area=" + area + "]";
	}

}