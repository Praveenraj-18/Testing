package org.changepond;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> itemList = new ArrayList<String>();
		itemList.add("Shirts");
		itemList.add("Trousers");
		itemList.add("Jackets");
		itemList.add("Shoes");
		
		for(String item:itemList) {
			System.out.println(item);
		}
		System.out.println("-------------------------------------");
		itemList.add(2,"Tie");
		itemList.remove(3);
		Iterator<String> iter =itemList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
			
		}
 
	}
}
