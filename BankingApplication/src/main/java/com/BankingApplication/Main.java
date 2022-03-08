package com.BankingApplication;

public class Main {

	/**
	 * PRODEDURE
	 * 1. calculate annual rate of interest with 4 %
	 * 2. calculate annual rate of interest with 5 %
	 * 3. 
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {

		/**
		 * with rate = 4
		 */		
		SavingsAccount intersetRate1 = new SavingsAccount(1000, 4, 3);
		intersetRate1.calculateAnnualRate();
		
		/**
		 * with rate = 5
		 */
		SavingsAccount intersetRate2 = new SavingsAccount(2000, 5, 1);
		intersetRate2.calculateAnnualRate();
		
		SavingsAccount monthlyRate = new SavingsAccount();
		monthlyRate.setSavingBalance(1200.00);
		System.out.println(monthlyRate);
		
		
		
	}

}
