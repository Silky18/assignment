package com.glsilky.bankmain;
import com.glsilky.services.Banking;

import java.util.Scanner;

import com.glsilky.modelbank.Customer;
//import com.greatlearning.model.Customer;




public class DriverClass {
	
	
public static void main(String[] args) {

	Banking banking= new Banking();
	//have the dependecy object here

	String bankAccountNo;
String password;
Scanner sc=new Scanner(System.in);
System.out.println("Please enter account no:");
bankAccountNo=sc.nextLine();
System.out.println("Please enter password:");
password=sc.nextLine();

Customer customer1=new Customer("ICICI123456","password");


if (customer1.getBankAccountNo().equals(bankAccountNo)  && customer1.getPassword().equals(password)) {

	int option;

	do { 
		System.out.println("Please enter option");
		System.out.println("1:Deposit");
		System.out.println("2:Withdraw");
		System.out.println("3.Transfer");
		System.out.println("4.Logout");
		option=sc.nextInt();
		
	switch(option)
	{
	case 1:
	System.out.println("Deposit");
	banking.deposit();
		break;
	case 2:
	System.out.println("Withdraw");
	banking.withdraw();
	break;
	case 3:
	System.out.println("Transfer");
	banking.transfer();	
	break;
	case 4:
	System.out.println("Logout");
		break;
	default: 
		System.out.println("Not valid input!try again");

	}
	}while(option!=4);
	
}
else
{
	System.out.println("Invalid id or password! pls try again");
}
System.out.println("Exiting the banking application");
	sc.close();
	}

}
