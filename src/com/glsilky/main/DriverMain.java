
package com.glsilky.main;
package com.glsilky.services;

import java.util.Scanner;

public class DriverMain {
public static void main(String args[])
{
	//create object of banking
    Banking banking=new Banking();
	System.out.println("Welcoem to login page");
	System.out.println("");
	System.out.println("Enter the bank account name:");
    Scanner sc=new Scanner(System.in);
    String bankaccount=sc.nextLine();
    
    System.out.println("Enter the bank account Password:");
    String  password=sc.nextLine();
    
   // System.out.println(bankaccount);
    //System.out.println(password);
    int option;
    option=sc.nextInt();
   
    do {
    	
    
    System.out.println();
    System.out.println("--------------------");
    System.out.println("Enter operation you want");
    System.out.println("1.Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Transfer");
    System.out.println("4. Logout");
    System.out.println("--------------------");
    
    
    switch(option) {
    case 1:
    	System.out.println("Performing deposit operation");
    	banking.deposit();
    	break;
    case 2:
    	System.out.println("Performing withdraw");
    	break;
    case 3:
    	System.out.println("Performing transer");
    	break;
    case 4:
    	System.out.println("Logout");
    	break;
    default:
    	System.out.println("Sorry! Invalid option.Please enter a valid option");
   
    }
    }while(option!=4);

    System.out.println("Exiting bsnking application");
    
    
    
    sc.close();
}
}
