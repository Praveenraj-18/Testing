package org.changepond;

public class OopsDemo {

	public static void main(String[] args) {
		Car bmw = new Car("BMW","5 Series", 2022);
		Car toyota = new Car("Toyota","Camry",1999);
		SportsCar mini = new SportsCar("BMW","mini",2024,330);
		
		System.out.println("Brand listed are "+bmw.getBrand()+ "," + toyota.getBrand());
		bmw.displayInfo();
		toyota.displayInfo();
		mini.displaySCInfo();

	}

}
