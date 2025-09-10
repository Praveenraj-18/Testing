package org.changepond;

public class SportsCar extends Car {
	int topSpeed;
	public SportsCar(String b , String m , int y, int ts) {
		super(b,m,y);
		this.topSpeed = ts;
	}
	public void displaySCInfo() {
		displayInfo();
		System.out.println("topspeed: "+ topSpeed + "mph");
	}
	}


