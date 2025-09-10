package org.changepond;

interface Shape{
	double calculate_area(int length, int breadth);
	void displayShapeName();
} 

public class Demo2 implements Shape {
	public double calculate_area(int length, int breadth) {
		return length*breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

}
