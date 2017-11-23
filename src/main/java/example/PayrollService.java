package com.example;

import com.example.exception.InvalidSalaryExcpetion;

public class PayrollService{


	public double hrs(double salary) throws InvalidSalaryExcpetion{

		if(salary<=0){
			throw new InvalidSalaryExcpetion("not valid");
		}
		
	return salary*60;

}

	

	public double da(double salary) throws InvalidSalaryExcpetion{

		if(salary<=0){
			throw new InvalidSalaryExcpetion("not valid");
		}
		
	return salary*10;

}


}
