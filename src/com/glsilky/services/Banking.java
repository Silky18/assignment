
package com.glsilky.services;
import java.util.Scanner;
/*
 * deposit
 * withdraw
 * otp genreration
 */
public class Banking {
	
	OTPgenerator optgenerator= new OTPgenerator(); 
	int bankBalance=1000;
	Scanner sc=new Scanner(System.in);
	
	public void deposit() {
		System.out.println("Please enter the amount u want to deposit");
		int amount=sc.nextInt();
		if (amount>0) {
		bankBalance=bankBalance+amount;
		System.out.println("u have succesfully deposited amount"+amount);
		System.out.println("Total bank balance is:"+bankBalance);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
	public void withdraw()
	{
		System.out.println("Please enter the amount u want to withdraw");
		int amount=sc.nextInt();
		if (amount>bankBalance) {
		System.out.println("not sufficient balance");
		}
		else
		{
			bankBalance=bankBalance-amount;
			System.out.println("u have succefully withdraw amount:"+amount);
			System.out.println("So total balance is:"+bankBalance);
			
		}
	}
	public void transfer() {
		int generatedotp;
		int amount;
		String bankAccountNumber;
		
		generatedotp=optgenerator.generateOTP();
		System.out.println("Please enter 4 digit otp");
		System.out.println("4 digit otp is:"+generatedotp);
		int otp=sc.nextInt();
		if(generatedotp==otp)
		{
			System.out.println("Valid otp");
			//System.out.println("Enter the bankaccount no and amount u want to transfer");
			System.out.println("Enter the amount u want to transfer");
			amount=sc.nextInt();
			System.out.println("Enter the bank account number ");
			bankAccountNumber=sc.nextLine();
			if(amount<=bankBalance)
			{
			bankBalance=bankBalance-amount;
			System.out.println("Amount:"+amount+"got successfully transferred to "+bankAccountNumber);
				System.out.println("");
				
		}
			else
			{
				System.out.println("Insufficent fund");
			}
		}
		else {
			System.out.println("Invalid otp try again");
		}
	
		
		
		}
}
