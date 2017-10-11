package com.bridgeit.testApp.Programs;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice:\n1.Convert Celsius to Fahrenheit\n2.Convert Fahrenheit to Celsius");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter value of Celsius");
			double celsius;
			celsius = scanner.nextDouble();
			tofahrenheit(celsius);
			break;
		case 2:
			System.out.println("Enter value of Fahrenheit");
			double fahrenheit;
			fahrenheit = scanner.nextDouble();
			toCelsius(fahrenheit);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}

	}

	static void toCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Celsius Representation is: " + celsius);

	}

	static void tofahrenheit(double celsius) {
		double fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Fahrenheit Representation is: " + fahrenheit);

	}

}
