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
	/**
	* calculate annual Interest
	*/
	public void calculateAnnualRate(){
		annualInterestRate = principal * rate * time;
	}
}
