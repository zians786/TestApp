package com.bridgeit.testApp.DataStructure;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Queue;

public class BankingCashCounter {

	static double cashAmount = 1000000.0;

	public static void main(String[] args) {
				
		System.out.println("Enter number of People in a Queue..");
		Scanner scanner =new Scanner(System.in);
		int number=scanner.nextInt();
		Queue cash=new Queue(number);
		Queue type=new Queue(number);
		System.out.println("For "+number+" People's Enter their Cash and type of Transaction..\nFor 'Deposite' Type 'd'  For 'Withdraw' Type w");
		for(int i=0;i<number;i++){
			cash.enqueue(scanner.nextInt());
			type.enqueue(scanner.nextLine());
			
		}
		cash.display();
		type.display();
		while(!cash.isEmpty() && !type.isEmpty()){
			String choice=(String)type.dequeue();
			if(choice=="d"){
				cashAmount=cashAmount+(int)cash.dequeue();
			}
			else {
				cashAmount=cashAmount-(int)cash.dequeue();
			}
		}
	
		System.out.println(cashAmount);
		
	}

}
