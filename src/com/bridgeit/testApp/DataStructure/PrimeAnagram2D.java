package com.bridgeit.testApp.DataStructure;

import java.util.Scanner;

import com.bridgeit.testApp.Utility.LinkedListUtility;
import com.bridgeit.testApp.Utility.Utility;

public class PrimeAnagram2D {

	public static void main(String[] args) {
		Utility util = new Utility();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Range Of Prime Number from 0 to...");
		int range = scanner.nextInt();
		int[] values = new int[range - 1];
		for (int i = 0; i < range - 1; i++) {
			values[i] = i;
		}
		int[] prime = util.prime(values);
		String str = "";
		for (int i = 0; i < prime.length; i++) {
			str = str + Integer.toString(prime[i]) + " ";
		}
		String[] strArray = str.split(" ");
		String anagram = "";
		String notAnagram = "";
		for (int i = 0; i < strArray.length; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (util.anagram(strArray[i], strArray[j])) {
					if (strArray[i].equals(strArray[j])) {

					} else {
						// System.out.print(" " + strArray[i] + " " +
						// strArray[j]);
						anagram += strArray[i] + " " + strArray[j] + " ";
					}
				} else {
					if (strArray[i].equals(strArray[j])) {

					} else {
						notAnagram += strArray[i] + " " + strArray[j] + " ";
					}
				}
			}
		}
		String[] anagramString = anagram.split(" ");
		int[] anagramArray = new int[anagramString.length];
		for (int i = 0; i < anagramArray.length; i++) {
			anagramArray[i] = Integer.parseInt(anagramString[i]);
		}
		util.bubbleSort(anagramArray);
		anagramArray = util.removeDuplicate(anagramArray);

		System.out.println("Number which are Prime Anagram are --> ");
		int[][] anagram2D = new int[10][100];
		int i = 0, k = 0, temp = 100;
		while (k < anagramArray.length) {
			int j = 0;
			while (k < anagramArray.length && anagramArray[k] < temp) {
				anagram2D[i][j++] = anagramArray[k++];
			}
			temp += 100;
			i++;

		}
		for (int y = 0; y < 10; y++) {
			for (int z = 0; z < 100; z++) {
				if (anagram2D[y][z] != 0) {
					System.out.print(anagram2D[y][z] + "  ");
				}
			}
			System.out.println();
		}
	}
}









































/*
 * System.out.println("Number which are Prime but Not Anagrams are --> ");
 * String[] notAnagramString=notAnagram.split(" "); int[] notAnagramArray=new
 * int[notAnagramString.length]; for(int a=0;a<notAnagramArray.length;a++){
 * notAnagramArray[a]=Integer.parseInt(notAnagramString[a]); }
 * util.bubbleSort(notAnagramArray);
 * notAnagramArray=util.removeDuplicate(notAnagramArray);
 * 
 * 
 * 
 * int[][] notAnagram2D = new int[10][100]; int b = 0, l = 0, tmp = 100; while
 * (l < notAnagramArray.length) { int j = 0; while (l < notAnagramArray.length
 * && notAnagramArray[l] < tmp) { notAnagram2D[b][j++] = notAnagramArray[l++]; }
 * tmp += 100; b++;
 * 
 * } for (int y = 0; y < 10; y++) { for (int z = 0; z < 100; z++) { if
 * (notAnagram2D[y][z] != 0) { System.out.print(notAnagram2D[y][z] + "  "); } }
 * System.out.println(); }
 * 
 * }
 * 
 * }
 */