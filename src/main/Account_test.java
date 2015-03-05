package main;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@SuppressWarnings("unused")
public class Account_test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		 Date dateCreated;
		 double withdrawamount=2500;
		 double depositamount=3000;
		 double interestRate=4.5;
		 
		 
		 Account acc=new Account(1122,20000);
		 acc.deposit(depositamount);
		 acc.withdraw(withdrawamount);
		 acc.getannualInterestRate();
		 
		 System.out.println("The account ID is"+acc.getID());
		 System.out.println("the date that this accout was created is"+acc.getdateCreated());
		 System.out.println("the final balance of the accoutn is"+acc.getbalance());
		 System.out.println("The monthly interest rate of this account is"+acc.monthlyInterestRate());
	}catch(InsufficeintFundsException e)
	{
		System.out.println("you are short on funds");
		e.printStackTrace();		 
		 
		
	}

}
