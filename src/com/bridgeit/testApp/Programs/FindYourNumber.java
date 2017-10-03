package com.bridgeit.testApp.Programs;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.Utility;

public class FindYourNumber {

	public static void main(String[] args) {
	//	int n=Integer.parseInt(args[0]);
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int N=(int)Math.pow(2,n);
		int a[]=new int [N];
		for(int i=0;i<N;i++){
			a[i]=i;
		}
		Utility util=new Utility();
		util.findYourNumber(a,n);
		
	}

}
