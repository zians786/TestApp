package com.bridgeit.testApp.Utility;

import java.util.Scanner;

public class Utility {

	public boolean checkPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean checkPalindrome(int number) {
		int copy = number;
		int reverse = 0;
		int carry;
		while (number > 0) {
			carry = number % 10;
			reverse = reverse * 10 + carry;
			number = number / 10;
		}
		if (reverse == copy) {
			return true;
		} else
			return false;
	}

	
	public int binarySearch(int find, int[] a) {
		int first=0,last=a.length-1,mid;
		while(first<=last){
			mid=(first+last)/2;
			
			if(a[mid]==find){
				return mid;
			}
			else if(a[mid]<find){
				first=mid+1;
			}
			else
				last=mid-1;
		}
		
		return -1;
	}
	
	public void insertionSort(int[] a){
		for(int i=1;i<a.length;i++){
			int j=i;
			int element=a[i];
			while(j>0 && a[j-1]>element){
				a[j]=a[j-1];
				j--;
			}
			
			a[j]=element;
			
		}
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
	
	
	public void bubbleSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	
	public void findYourNumber(int[] a, int n){
		Scanner scan=new Scanner(System.in); 
		int first=0,last=a.length-1,mid=0;
		while(n!=0){
			mid=(first+last)/2;
			
			System.out.println("Is the Number between '"+first+"' '"+last+"' Type 'yes' for Yes , 'no' for No");
			//String ch=scan.nextLine();
			if("yes"==scan.nextLine()){
				last=mid-1;
			}
			else
			{
				first=mid+1;
			}
			System.out.println(a[mid]);
			n--;
			mid=(first+last)/2;
		
		}
	}
	
}