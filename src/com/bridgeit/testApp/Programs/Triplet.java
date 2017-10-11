package com.bridgeit.testApp.Programs;

public class Triplet {
	
	public static void main(String[] args) {
		Triplet triplet = new Triplet();
		int array[] = { 1, -1, 0, 2, -2, 1 };
		int sum = 0;
		int arr_size = array.length;

		triplet.find3Numbers(array, arr_size, sum);
	}

	
	
	void find3Numbers(int A[], int arr_size, int sum) {
		int l, r;

		for (int i = 0; i < arr_size - 2; i++) {
			for (int j = i + 1; j < arr_size - 1; j++) {
				for (int k = j + 1; k < arr_size; k++) {
					if (A[i] + A[j] + A[k] == sum) {
						System.out.println(A[i] + " ," + A[j] + " ," + A[k]);
	
					}
				}
			}
		}

	
	}

	}
