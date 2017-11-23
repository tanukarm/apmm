package com.example;

import org.junit.Assert;
import org.junit.Test;

import com.example.exception.InvalidSalaryExcpetion;

public class PayrollServiceTest{

	@Test
	public void dashouldbe10percentofSalary() throws InvalidSalaryExcpetion{
		
	PayrollService pay = new PayrollService();
	double rs = pay.da(10000.00);
	Assert.assertEquals(100000.00,rs,2);

	

}
	
	@Test(expected=InvalidSalaryExcpetion.class)
	public void daproducenegativesalary() throws InvalidSalaryExcpetion{
		
	PayrollService pay = new PayrollService();
 pay.hrs(-10000.00);
	//Assert.assertEquals(600000.00,rs,2);

	

}



}