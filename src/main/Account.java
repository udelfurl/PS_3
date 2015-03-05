package main;
import java.util.Date;
public class Account {
	private int ID;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated=new java.util.Date();
	public Account(){
		ID=0;
		balance=0.0;
		annualInterestRate=0.0;
}
	Account(int newID, double newbalance){
		ID=newID;
		balance=newbalance;
}
	public int getID(){
		return ID;
	}
	public double getbalance(){
		return balance;
	}
	public double getannualInterestRate(){
		return annualInterestRate;
	}		
	public void setID(int newID){
		ID=newID;
	}
	public void setbalance(double newbalance){
		balance=newbalance;
	}
	public void setannualInterestRate(double newannualInterestRate){
		annualInterestRate=newannualInterestRate;
	}
	public Date getdateCreated(){
		return dateCreated;
	}
	double monthlyInterestRate(){
		return annualInterestRate/12;
	}
	
	double deposit(double depositamount){
		return balance+=depositamount;
	}
		
	double withdraw(double withdrawamount) throws InsufficeintFundsException{
		if (withdrawamount<=balance){	
		return balance-=withdrawamount;
		}
		else
		{	

			double needs=withdrawamount-balance;
			throw new InsufficeintFundsException(needs);
	}
	}

}

	

	
		
	

		
		
		



