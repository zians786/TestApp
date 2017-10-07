package com.bridgeit.testApp.Utility;

import java.util.Scanner;

public class Utility {

	public double stopWatch() {
		double start = System.currentTimeMillis();
		return start;
	}

	public double elapseTime(double start) {
		double now = System.currentTimeMillis();
		return (now - start) / 1000;
	}

	public boolean checkPrime(int number) {
		int m = number / 2;
		for (int i = 2; i <= m; i++) {
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

	public <E extends Comparable<E>> int binarySearch(E find, E[] array) {
		int first = 0, last = array.length - 1, mid;
		while (first <= last) {
			mid = (first + last) / 2;

			if (array[mid].compareTo(find) == 0) {
				return mid;
			} else if (array[mid].compareTo(find) < 0) {
				first = mid + 1;
			} else
				last = mid - 1;
		}

		return -1;
	}

	/*
	 * public int binarySearch(int find, int[] a) { int
	 * first=0,last=a.length-1,mid; while(first<=last){ mid=(first+last)/2;
	 * 
	 * if(a[mid]==find){ return mid; } else if(a[mid]<find){ first=mid+1; } else
	 * last=mid-1; }
	 * 
	 * return -1; }
	 */

	/*
	 * public void insertionSort(int[] a){ for(int i=1;i<a.length;i++){ int j=i;
	 * int element=a[i]; while(j>0 && a[j-1]>element){ a[j]=a[j-1]; j--; }
	 * 
	 * a[j]=element;
	 * 
	 * } for(int i=0;i<a.length;i++){ System.out.println(a[i]); }
	 * 
	 * }
	 */
	public <E extends Comparable<E>> void insertionSort(E[] array) {
		for (Integer i = 1; i < array.length; i++) {
			Integer j = i;
			E element = array[i];
			while (j > 0 && array[j - 1].compareTo(element) > 0) {
				array[j] = array[j - 1];
				j--;
			}

			array[j] = element;

		}
		for (E ele : array) {
			System.out.println(ele);
		}

	}

	public <E extends Comparable<E>> E[] bubbleSort(E[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j].compareTo(a[j + 1]) > 0) {
					E temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

		return a;
	}

	/*
	 * public void bubbleSort(int[] a){ for(int i=0;i<a.length-1;i++){ for(int
	 * j=0;j<a.length-1;j++) { if(a[j]>a[j+1]){ int temp=a[j]; a[j]=a[j+1];
	 * a[j+1]=temp; } } }
	 * 
	 * for(int i=0;i<a.length;i++){ System.out.println(a[i]); } }
	 */

	public void findYourNumber(int[] a, int n){
		Scanner scan=new Scanner(System.in); 
		int first=0,last=a.length-1,mid=(last+first)/2;
		while(n!=0){
		
			System.out.println("Is the Number between '"+first+"' '"+last+"' Type 'yes' for Yes , 'no' for No");
			String ch="yes";
			if(ch.equals(scan.nextLine())){
				last=mid;
				
			}
			else
			{
				
				first=mid+1;
			}
		//	System.out.println(a[mid]);
			mid=(last+first)/2;
			n--;
		
		}
	}

	public int dayOfWeek(int month,int day,int year){
		int y0=year-(14-month)/12;
		int x=y0+(y0/4)-(y0/100)+(y0/400);
		int m0=month+12*((14-month)/12)-2;
		int d0=(day+x+(31*m0)/12)%7;
		
		return d0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}