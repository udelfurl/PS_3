package main;

public class InsufficeintFundsException extends Exception {
	private double amount;
	
	public InsufficeintFundsException(double amount){
		this.amount=amount;
	}
	public double getAmount()
	{
		return amount;
	}
	
}
