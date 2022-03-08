package com.BankingApplication;

public class Main {

	/**
	 * PRODEDURE
	 * 1. calculate annual rate of interest with 4 %
	 * 2. calculate annual rate of interest with 5 %
	 * 3. Calculating monthly balance after calculating with rate of interest
	 * 
	 * @param args - values for calculating rate of interest
	 */
	
	public static void main(String[] args) {

		/**
		 * Object for 2 saving accounts
		 */
		SavingsAccount saving1 = new SavingsAccount();
		SavingsAccount saving2 = new SavingsAccount();

		/**
		 * Balance that saving accounts have
		 */
		saving1.setSavingBalance(2000.00);
		saving2.setSavingBalance(3000.00);
		
		/**
		 * modify rate of interest to 4%
		 */
		SavingsAccount.modifiedRateOfIntrest(4);
		
		/**
		 * monthly Interest for both accounts at 4%
		 */
		
		saving1.calculateMonthlyInterast();
		saving2.calculateMonthlyInterast();
		
		/**
		 * According to 4% monthly rate of interest Balance for Both the accounts  
		 */
		System.out.println("\nBalance for saving account 1 with rate of intrest 4% is " +saving1);
		System.out.println("\nBalance for saving account 2 with rate of intrest 4% is " +saving2);
		
		/**
		 * modify rate of interest to 5% 		
		 */
		SavingsAccount.modifiedRateOfIntrest(5);
		
		saving1.calculateMonthlyInterast();
		saving2.calculateMonthlyInterast();
		
		/**
		 * According to 5% monthly rate of interest Balance for Both the accounts
		 */
		System.out.println("\nBalance for saving account 1 with rate of intrest 4% is " +saving1);
		System.out.println("\nBalance for saving account 2 with rate of intrest 4% is " +saving2);
	
	}

}













