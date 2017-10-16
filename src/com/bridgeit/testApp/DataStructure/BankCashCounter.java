package com.bridgeit.testApp.DataStructure;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.LinkedQueue;

public class BankCashCounter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Welcome to the Bank of World...\nDo You Want to do any Transacction With Us..    for Yes type 'y' else 'n' ");
		String choose=scanner.nextLine();
		String yes = "y";
		
		while (yes.equals(choose)) {
			double balance=(Math.random()*10000);
			LinkedQueue queue=new LinkedQueue();
			System.out.println("Enter your Choice\n1.Deposite\n2.Withdraw");
			int choice=scanner.nextInt();
			switch(choice){
			case 1:
				String type="Deposite";
				queue.insert(type);
				System.out.println("Enter Amount you want to deposite");
				double deposite=scanner.nextDouble();
				queue.insert(deposite);
				transaction(queue,balance);
				break;
			case 2:
				String typ="Withdraw";
				queue.insert(typ);
				System.out.println("Enter Amount you want to Withdraw");
				double withdraw=scanner.nextDouble();
				queue.insert(withdraw);
				transaction(queue,balance);
				break;
			}
			System.out.println("Do You Want to Continue With Another Person....  For Yes type 'y' else 'n'" );
			choose=scanner.nextLine();
		}

	}



public static void transaction(LinkedQueue queue,double balance){
	System.out.println("Your Current balance is"+balance+"\nAfter Transaction");
	String type="Deposite";
	String select=(String)queue.remove();
	
	if(type.equals(select)){
		double deposite=(double)queue.remove();
		balance+=deposite;
		System.out.println("Your Current balance is "+balance);
		}
	
		else if(!type.equals(select)){
			double withdraw=(double)queue.remove();
			if(withdraw>balance){
				System.out.println("Your have Insufficient balance for this Transaction..");
			}
			else{
				balance-=withdraw;
				System.out.println("Your Current balance is "+balance);
			}
	}
}
}