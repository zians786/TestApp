package com.bridgeit.testApp.DataStructure;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.CalenderUtility;
import com.bridgeit.testApp.Utility.LinkedQueue;
import com.bridgeit.testApp.Utility.Queue;

public class CalenderUsingQueue {

	public static void main(String[] args) {
		CalenderUtility utility = new CalenderUtility();

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter full year (e.g., 2001): ");
		int year = scan.nextInt();

		System.out.print("Enter month in number between 1 and 12: ");
		int month = scan.nextInt();

		if (month < 1 || month > 12 || year < 1980)
			System.out.println("Wrong input!");
		else {
			String day = "Sun Mon Tue Wed Thu Fri Sat";
			String[] days = day.split(" ");
			LinkedQueue daysQueue = new LinkedQueue();
			for (int i = 0; i < days.length; i++) {
				daysQueue.insert(days[i]);
			}

			int numberOfDaysInMonth = utility.getNumberOfDaysInMonth(year, month);
			int startDay = utility.getStartDay(year, month);

			LinkedQueue dateQueue = new LinkedQueue();
			for (int i = 0; i < startDay; i++) {
				dateQueue.insert("  ");
			}
			for (int i = 1; i <= numberOfDaysInMonth; i++) {
				dateQueue.insert(i);
			}
			
			System.out.println("         " + utility.getMonthName(month) + " " + year);
			System.out.println("–––––––––––––––––––––––––––––––––");
			while(!daysQueue.isEmpty()){
				System.out.print(daysQueue.remove()+"  ");
			}
			
		
				for(int i=0;i<startDay;i++){
					System.out.println(dateQueue.remove());
				}
				
				while(!dateQueue.isEmpty()){
					int date=(int)dateQueue.remove();
					if (date < 10)
						System.out.print( date+"    " );
					else
						System.out.print( date+"   " );
					if ((date + startDay) % 7 == 0)
						System.out.println();
				}}
				System.out.println();
			}

			
			
		

	}


