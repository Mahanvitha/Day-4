package com.capgemini.java.day4;

import com.capgemini.java.NetSalary;

public class SalesManager extends NetSalary {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;

	public SalesManager(String employeeId, String employeeName, double netSalary) {
		super(employeeId, employeeName, netSalary);

	}
@Override
public double SalesMangerAllowance(double netSalary) {

	petrolAllowance = basicSalary*0.08;
	foodAllowance = basicSalary*0.13;
	otherAllowance = basicSalary*0.03;
	 
	return super .netSalary()+petrolAllowance+foodAllowance+otherAllowance;
	
}
}
