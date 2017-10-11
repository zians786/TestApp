package com.bridgeit.testApp.Programs;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String arg[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Amount..");
		int amount=scanner.nextInt();
		int[] notes={1000,500,100,50,20,10,5,2,1};
		int index=0,total=0;
		while(amount>0){
			if((amount/notes[index])>=1){
				int remain=amount%notes[index];
				int count=amount/notes[index];
				System.out.println(count+" note requred of value "+notes[index]);
				total=total+count;
				amount=remain;
				
			}
			else
				index++;
		}
		System.out.println("And total number of notes required are --> "+total);
	}
}