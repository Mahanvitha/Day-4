package com.capgemini.java;

public class NetSalary {
	private String employeeId;
	private String employeeName;
	private double hra;
	private double pf;
	private final int pt=100;
	private double grossSalary;
	private final double medical=500;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public int getPt() {
		return pt;
	}
	public double getMedical() {
		return medical;
	}
	private double netSalary;
	protected double basicSalary;

public NetSalary(String employeeId,String employeeName,double netSalary) {
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.basicSalary = netSalary;
}
public NetSalary(String employeeId,String employeeName,double netSalary,double medical) {
	this.employeeId=employeeId;
	this.employeeName=employeeName;
	this.basicSalary = netSalary;
}
public double netSalary() {
	hra = basicSalary/2;
	pf = basicSalary*12/100;
	grossSalary = hra+medical+basicSalary;
	netSalary = grossSalary-(pf+pt);
	return netSalary;
}
public void displayEmployeeDetails() {
	System.out.println("Employee Id:"+employeeId+"Employee Name:"+employeeName+"Net Salary is:"+netSalary);
}
public double SalesMangerAllowance(double allowance) {
	// TODO Auto-generated method stub
	return 0;
}
public double President(double netSalary) {
	// TODO Auto-generated method stub
	return 0;
}
}

	