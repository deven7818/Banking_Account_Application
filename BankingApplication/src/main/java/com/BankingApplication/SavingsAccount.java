package com.BankingApplication;

/*
* annual interest calculation
*/
public class SavingsAccount {

	/**
	 * Static variables - annual interest rate.
	 */
	public static double annualInterestRate;
	private double savingBalance;

	/**
	 * Default Constructor
	 */
	public SavingsAccount() {

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

	public double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}

	/**
	 * toString method
	 */
	@Override
	public String toString() {
		return "Total balance $"+ savingBalance ;
	}

	/**
	 * Calculate Monthly Interest
	 */
	public double calculateMonthlyInterast() {
		double monthlyInterest = (savingBalance * (annualInterestRate / 1200));
		savingBalance = savingBalance * monthlyInterest;
		return monthlyInterest;
	}
	
	/**
	*modify rate of interest with new rate of interest
	*/
	public static void modifiedRateOfIntrest(double newRateOfIntrest) {
		annualInterestRate = newRateOfIntrest;
	}
}
