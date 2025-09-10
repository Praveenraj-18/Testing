package org.changepond;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product Details\nId: ");
		int id = sc.nextInt();
		System.out.println("Product Name: ");
		String pname = sc.next();
		System.out.println("Product Quantity: ");
		int quantity = sc.nextInt();
		System.out.println("Product Price: ");
		int price = sc.nextInt();
		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Database@123");
		PreparedStatement ps = con.prepareStatement("insert into ProductDetails values(?,?,?,?)");
		
		ps.setInt(1, id);
		ps.setString(2, pname);
		ps.setInt(3, quantity);
		ps.setInt(4, price);
		
		int a = ps.executeUpdate();
		if(a>0) {
			System.out.println(a+" Record inserted successfully");
		}

	}

}
