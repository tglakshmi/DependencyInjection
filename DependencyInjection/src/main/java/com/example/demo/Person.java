package com.example.demo;

public class Person {
	private HomeLoan homeLoan;
	

	public Person() {
		System.out.println("Person default constructor");
	}

	public HomeLoan getHomeLoan() {
		return homeLoan;
	}

	public void setHomeLoan(HomeLoan homeLoan) {
		this.homeLoan = homeLoan;
	}
	void emi()
	{
		homeLoan.homeLoanEmi();
	}
	

}
