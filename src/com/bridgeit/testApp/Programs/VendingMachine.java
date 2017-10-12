package com.bridgeit.testApp.Programs;

import java.util.Scanner;

public class VendingMachine {
	static int total=0;
	static int index=0;
	public static void main(String arg[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Amount..");
		int amount=scanner.nextInt();
		int[] notes={1000,500,100,50,20,10,5,2,1};
		int total=vendingMachine(notes,amount);
		
		System.out.println("And total number of notes required are --> "+total);
	}
	
	public static int vendingMachine(int[] notes,int amount){
		
		if(amount==0)
		{
			return total;
		}
		else if((amount/notes[index])>=1){
			int remain=amount%notes[index];
			int count=amount/notes[index];
			System.out.println(count+" note requred of value "+notes[index]);
			total=total+count;
			amount=remain;
			
		}
		else{
			index++;
	}
	return vendingMachine(notes,amount);
}
}