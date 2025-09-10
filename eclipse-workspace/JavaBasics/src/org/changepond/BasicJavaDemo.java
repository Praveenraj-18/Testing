package org.changepond;

import java.util.Scanner;

public class BasicJavaDemo {

	public static void main(String[] args) {

		/*System.out.println("Hello world!");
		 * Swapping
		int num=1, num1=2;
		System.out.println("Original values of num and num1 are " + num + "," + num1);
		int temp = num;
		num = num1;
		num1 = temp;
		System.out.println("swapped values of num and num1 " + num + "," + num1);
		System.out.println("Original values of num and num1 are " + num + "," + num1);
		//swapping without temporary variable
		//using addition and subtraction
		num = num1 + num;
		num1=num-num1;
		num=num-num1;
		System.out.println("swapped values of num and num1 " + num + "," + num1);
		System.out.println("Original values of num and num1 are " + num + "," + num1);
		//using multiplication and division
		num = num1*num;
		num1=num/num1;
		num=num/num1;
		System.out.println("swapped values of num and num1 " + num + "," + num1);*/
		//--------------------------------------------------------------------------------------------
		
		// leap year or not
		
		/*int year = 2005;
		if(year%400==0) {
			System.out.println(year+ " is leap year");
		}
		else {
			if (year%4==0) {
				if(year%100!=0) {
					System.out.println(year+ " is a leap year");
				}
				else {
					System.out.println(year+ " is not a  leap year");
				}
			}
			else {
				System.out.println(year+ " is not a leap year");
			}			
			}*/
		//---------------------------------------------------------------------------------------------
		
		//reducing line of codes
		
		/*int year = 2100;
		if(year%400==0) {
			System.out.println(year+ " is leap year");
		}
		else if(year%4==0 && year%100!=0) {
			System.out.println(year+ " is leap year");
		}
		else {
			System.out.println(year+ " is not a leap year");
		}
		*/
		//----------------------------------------------------------------------------------------------
		
		//reducing the code further
		
		/*int year = 2020;
		if(year%400==0 || year%100!=0 && year%4==0) {
			System.out.println(year+ " is leap year");
		}
		else {
			System.out.println(year+ " is not a leap year");
		}
		*/
		//----------------------------------------------------------------------------------------------
		
		//while loop
		
		/*Scanner sc = new Scanner(System.in);
		int sum = 0;
		boolean flag = true;
		while(flag) {
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			if(num<0) {
				System.out.println("Number entered is negative ...so exit and print sum");
				//break;
				flag = false;
			}
			else {
				sum=sum+num;
		}
	}
	System.out.println("the sum of entered number is: "+sum);
	*/
		//-------------------------------------------------------------------------------------------------
		
		// for loop
		
		/*int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println(sum);
		*/
		//-------------------------------------------------------------------------------------------------
		
		// factorial
		
		/*
		int num = 5;
		int fact = 1;
		for (int i=num;i>1;i--) {
			fact*=i;
		}
		System.out.println("factorial of the number "+num+" is: " +fact);
		*/
		//-------------------------------------------------------------------------------------------------	
		
		//Switch case
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day : ");
		String day = sc.next();
		switch(day) {
		case "Mon":
			System.out.println("1st day of week :( ");
			break;
		case "Tue":
			System.out.println("2nd day of week :( ");
			break;
		case "Wed":
			System.out.println("3rd day of week :( ");
			break;
		case "Thu":
			System.out.println("4th day of week :( ");
			break;
		case "Fri":
			System.out.println("5th day of week :) ");
			break;
		case "Sat":
			System.out.println("its SATURDAY HURRAY :) ");
			break;
		case "Sun":
			System.out.println("its sunday Dont go fast!!");
			break;
		default :
			System.out.println("Enter the correct day...");
		}
		*/
		//-----------------------------------------------------------------------------------------------
	
		// ELIGIBILITY FOR VOTING
		
	/*System.out.println("Enter the age: ");	
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
	if(age>=18) {
		System.out.println("This person can vote");
	}
	else {
		System.out.println("This person cant vote!!");
	}
	*/
	//---------------------------------------------------------------------------------------------------
		
	// Shopping
		
	/*System.out.println("Enter Product: ");
	Scanner p = new Scanner(System.in);
	String product = p.next();
	System.out.println("Enter Quantity: ");
	Scanner q = new Scanner(System.in);
	int quantity = q.nextInt();
	int sum = quantity*250;
	if(sum<1000) {
		System.out.println("Ur amount is "+sum);
	}
	else {
		int total= sum;
		System.out.println("Ur sum is "+total);
		sum*=0.1;
		System.out.println("Ur discounted price is "+sum);
		total=total-sum;
		System.out.println("Ur total price is "+total);
	}
	*/
	//-------------------------------------------------------------------------------------------
	
	// rectangle is square or not
		
	/*Scanner s = new Scanner(System.in);
	System.out.println("Enter Length: ");
	int length  = s.nextInt();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Breadth: ");
	int breadth  = sc.nextInt();
	if(length==breadth) {
		System.out.println("Its a Square");
	}
	else {
		System.out.println("Its a Rectangle");
	}
	*/
	//----------------------------------------------------------------------------------------------
	
	// checking the occurrence 
	
	/*Scanner s = new Scanner(System.in);
	System.out.println("Enter String: ");
	String text  = s.nextLine();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Key: ");
	char letter  = sc.next().charAt(0);
	int count=0;
	for(int i=0;i<text.length();i++) {
		if(text.charAt(i)==letter) {
			count++;
			
		}
	}
	System.out.println("The number of times the letter "+letter+" comes is "+count);
	*/
	//-----------------------------------------------------------------------------------------------
	
	//star pattern
	/*
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/
	//------------------------------------------------------------------------------------------------
	
	}
	}
