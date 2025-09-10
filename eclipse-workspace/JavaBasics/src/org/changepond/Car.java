package org.changepond;

public class Car {
	private String brand;
	private String model;
	private int year;

	public Car(String b,String m, int y) {
		this.brand = b;
		this.model = m;
		this.year = y;
	}
	public void setYear(int year ) {
		if(year < 2000) {
			System.out.println("Model is very old");
			this.year = 2025;
		}
		else {
				this.year = ;
			}
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void displayInfo() {
		System.out.println("Brand: " +brand +", Model:" + model + ", "+" Manufaturing year: "+ year);
	}
}
