package com.capgemini.java.day4;

import com.capgemini.java.NetSalary;

public class PresidentSalary extends NetSalary{
	private double kilometers;
	private static double telephoneAllowance=2000;


	public PresidentSalary(String employeeId, String employeeName, double netSalary,double medical) {
		super(employeeId, employeeName, netSalary,medical);
		this.kilometers=kilometers;
	}



@Override
public double President(double netSalary) {

	
	return super.netSalary()+kilometers*8+telephoneAllowance;
	
}
}
