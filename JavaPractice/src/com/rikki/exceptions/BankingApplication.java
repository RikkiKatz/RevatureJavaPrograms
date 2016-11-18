package com.rikki.exceptions;

public class BankingApplication {
	
	double accountBalance = 1000.00;
	
	/**
	 * Takes a positive number and withdraws that amount from your account balance
	 * User can't supply negative number
	 * 
	 * @param funds
	 * @throws InsufficientFundsException if user doesn't have sufficient funds
	 */
	
	public void withdraw(double funds) throws InsufficientFundsException{
		if( funds < 0 )
			//unchecked/ runtime exception: compiler doesn't force try/catch
			throw new IllegalArgumentException();
		
		if( funds > accountBalance)
			// checked exception: compiler forces try/catch
			throw new InsufficientFundsException();
		System.out.println("Withdrawing $" + funds);
	}
	
	public static void main(String[] args) {
		BankingApplication atm = new BankingApplication();
		try {
			atm.withdraw(10_000.00);
			System.out.println("Take your cash.");
		} catch (InsufficientFundsException e) {
			System.out.println("Insufficient Funds.");
		}
	}
	
}
