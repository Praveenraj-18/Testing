package org.changepond;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		/*
		int [] prime_numbers = new int[6];
		int [] primes = {17,3,5,7,11,13};
		for(int i=0;i<primes.length;i++) {
			System.out.println("Prime numbers is " + primes[i]);
		}
		for(int prime:primes) { // for i in range similar to that
			System.out.println("Prime numbers =" +prime);
		}
		
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(matrix[1][1]);// 1st row 1st column
		for (int[] mat : matrix) { //{1,2,3} is sent from matrix to mat
			for(int m:mat) { //{1},{2},{3} is sent from mat to m
				System.out.print(m);
			}
			System.out.println();
		}
		int[] copyOfPrimes = Arrays.copyOf(primes, primes.length);
		System.out.println("Original array" + Arrays.toString(primes));
		System.out.println("Copied array" + Arrays.toString(copyOfPrimes));
		
		// to sort array
		Arrays.sort(primes);
		System.out.println("Sorted array "+ Arrays.toString(primes));
		
		// getting index value
		int index = Arrays.binarySearch(primes, 7);
		System.out.println("number 7 is at position "+ index);
		
		String [] design = new String[50];
		Arrays.fill(design, "*");
		System.out.println(Arrays.toString(design));
	*/
	//----------------------------------------------------------------------------------------
	int [] prime_numbers = new int[6];
	int [] primes = {3,5,7,11,13};
	
	int max= primes[0];
	int min = primes[0];
	for(int prime:primes) {
		if(prime>max) {
			max=prime;
		}
		if(prime<min) {
			min=prime;
		}
	}
	System.out.println("Maximum is "+ max);
	System.out.println("Minimum is "+ min);
	
//int [] primes = {3,5,7,11,13};
	for(int i=0;i<primes.length/2;i++) {
		int temp = primes[i];
		primes[i] = primes[primes.length-1-i];
		primes[primes.length-1-i] = temp;
	}
	System.out.println("Reverse array"+ Arrays.toString(primes));
	}
}
