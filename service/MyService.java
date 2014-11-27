package com.as.service;

import java.util.Date;

public class MyService {
	public String sayHello(){
		return "Hello World";
		
	}
	public Date geServerDate(){
		return new Date();
	}
	
	public String sayHelloWithName(String name){
		return "Hello" + name;
		
	}
	public EmployeeVO getEmployee (int empID){
		
	
	EmployeeVO empVO= new EmployeeVO();
	
	empVO.setEmpId(empID);
	empVO.setAddress("123 Fremont");
	empVO.setCity("Fremont");
	empVO.setState("CA");
	empVO.setZipCode("94445");
	empVO.setSalary(1000+empID);
	return empVO;
	}
	
}
