package org.changepond;

public class ExceptionalHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(10/0);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Im executed");
		}
		System.out.println("hi");
	}

}
