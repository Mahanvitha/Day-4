package com.capgemini.java.day4_1;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeAddress;
	private int employeePhone;
	private double basicSalary;
	private final double specialAllowance=250.80;
	private final double hra = 1000.50;

public Employee() {
	super();
	
}
public Employee(long employeeId,String employeeName, String accType, String employeeAddress, int employeePhone) {
	this();
	this.employeeId= employeeId;
	this.employeeName= employeeName;
	this.employeeAddress= employeeAddress;
	this. employeePhone =  employeePhone;	
}
public double calculateSalary(double salary) {
	salary = basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);	
	System.out.println("Basic Salary:"+basicSalary);
	return salary;
}
public long getEmployeeId() {
	return employeeId;
}
public void setEmployeeId() {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName() {
	this.employeeName = employeeName;
}
public String getEmployeeAddress() {
	return employeeAddress;
}
public void setEmployeeAddress() {
	this.employeeAddress = employeeAddress;
}
public String getEmployeePhone() {
	return employeeAddress;
}
public void setEmployeePhone() {
	this.employeeAddress = employeeAddress;
}
}









