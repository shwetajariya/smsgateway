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
@Table(name = "Employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.Integer id;
    // @NotNull
    // private java.lang.Integer employeeNumber;
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

    @Pattern(regexp = "^\\d{3}$", message = "{invalid.phonenumber}")
    private java.lang.String firstNumber;
    @Pattern(regexp = "^\\d{3}$", message = "{invalid.phonenumber}")
    private java.lang.String middleNumber;
    @Pattern(regexp = "^\\d{4}$", message = "{invalid.phonenumber}")
    private java.lang.String lastNumber;
    // @Pattern(regexp = "^\\d{10}$", message = "{invalid.phonenumber}")
    // private java.lang.String mobileNumber;
    private java.lang.String ipContactNumber;
    @NotNull
    private java.lang.String priority;
    @Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
	    + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
	    + "(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message = "{invalid.email}")
    private java.lang.String email;
    private java.lang.String address;
    private java.lang.String area;
    private java.lang.String address1;
    private java.lang.String address2;
    private java.lang.String city;
    private java.lang.String state;
    private java.lang.String postal;

    public java.lang.String getAddress1() {
	return address1;
    }

    public void setAddress1(java.lang.String address1) {
	this.address1 = address1;
    }

    public java.lang.String getAddress2() {
	return address2;
    }

    public void setAddress2(java.lang.String address2) {
	this.address2 = address2;
    }

    public java.lang.String getCity() {
	return city;
    }

    public void setCity(java.lang.String city) {
	this.city = city;
    }

    public java.lang.String getState() {
	return state;
    }

    public void setState(java.lang.String state) {
	this.state = state;
    }

    public java.lang.String getPostal() {
	return postal;
    }

    public void setPostal(java.lang.String postal) {
	this.postal = postal;
    }

    public java.lang.String getFirstNumber() {
	return firstNumber;
    }

    public void setFirstNumber(java.lang.String firstNumber) {
	this.firstNumber = firstNumber;
    }

    public java.lang.String getMiddleNumber() {
	return middleNumber;
    }

    public void setMiddleNumber(java.lang.String middleNumber) {
	this.middleNumber = middleNumber;
    }

    public java.lang.String getLastNumber() {
	return lastNumber;
    }

    public void setLastNumber(java.lang.String lastNumber) {
	this.lastNumber = lastNumber;
    }

    public java.lang.Integer getId() {
	return id;
    }

    public void setId(java.lang.Integer id) {
	this.id = id;
    }

    // public java.lang.Integer getEmployeeNumber() {
    // return employeeNumber;
    // }
    //
    // public void setEmployeeNumber(java.lang.Integer employeeNumber) {
    // this.employeeNumber = employeeNumber;
    // }

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

    // public java.lang.String getMobileNumber() {
    // return mobileNumber;
    // }
    //
    // public void setMobileNumber(java.lang.String mobileNumber) {
    // this.mobileNumber = this.firstNumber + this.middleNumber
    // + this.lastNumber;
    // }

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
	this.address = this.address1 + " " + this.address2 + " " + this.city
		+ " " + this.state + " " + this.postal + " " + this.area;
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
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	return "Employee [id=" + id + ", firstName=" + firstName
		+ ", lastName=" + lastName + ", company=" + company
		+ ", designation=" + designation + ", department=" + department
		+ ", section=" + section + ", firstNumber=" + firstNumber
		+ ", middleNumber=" + middleNumber + ", lastNumber="
		+ lastNumber + ", ipContactNumber=" + ipContactNumber
		+ ", priority=" + priority + ", email=" + email + ", address="
		+ address + ", area=" + area + ", address1=" + address1
		+ ", address2=" + address2 + ", city=" + city + ", state="
		+ state + ", postal=" + postal + "]";
    }

}