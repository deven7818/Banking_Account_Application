package com.BankingApplication;

/*
* annual interest calculation
*/
public class SavingsAccount {

	/**
	 * Static variables - annual interest rate.
	 */
	public static double annualInterestRate;

	/*
	 * variables to calculate annual rate
	 */
	float principal, rate, time;
	private double savingBalance;


	/**
	*Default Constructor
	*/
	public SavingsAccount(){
		
	}
	/**
	 * Parameterized constructor
	 */
	public SavingsAccount(float principal, float rate, float time) {
		this.principal = principal;
		this.rate = rate;
		this.time = time;
	}

	/*
	* Getter and Setter
	*/
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public float getPrincipal() {
		return principal;
	}

	public void setPrincipal(float principal) {
		this.principal = principal;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public double getSavingBalance() {
		return time;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	
	/**
	* calculate annual Interest
	*/
	public void calculateAnnualRate(){
		annualInterestRate = principal * rate * time;
	}
	
	/**
	*Calculate Monthly Interest
	*/
	public float calculateMonthlyInterast(){
		float monthlyInterest = (float) ((savingBalance * annualInterestRate) / 12);
		return monthlyInterest;
	}
}
