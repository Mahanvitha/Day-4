package com.capgemini.java.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.capgemini.java.day4.EmployeeMembers;
import com.capgemini.java.day4.PresidentSalary;
import com.capgemini.java.day4.SalesManager;

class NetSalaryTest {

@Test
void setUp() {
	assertEquals(14200, new SalesManager("12345","Tom",10000).netSalary());
}
}