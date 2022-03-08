package com.glsilky.services;
import java.util.Scanner;
/*
 * Withdraw
 * deposit
 * transfer(otp generation)
 * 
 */
public class Banking {
	//var name lower camelcase
	int bankBalance=1000;
	Scanner sc=new Scanner(System.in);

	public void deposit() {
		System.out.println("Ennter amounr u want to deposit:");
		int amount;
		amount=sc.nextInt();
		if(amount>0) {
		bankBalance=bankBalance+amount;
		System.out.println("Amount :"+amount);
		System.out.println("Total balance");
	}
		else
			System.out.println("Enter correctr szmony");
		}
	
}
