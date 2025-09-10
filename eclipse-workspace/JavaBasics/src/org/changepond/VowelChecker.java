package org.changepond;
//task6
import java.util.Scanner;

class VowelNotFoundException extends Exception{
	VowelNotFoundException(String s){
		super(s);
	}
}
 
class VowelCheckExp{
	void vowelChecker(String s) throws VowelNotFoundException {
		String temp = s.toLowerCase();
		boolean flag = false;
		for(char k:temp.toCharArray()) {
			if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u') {
				flag = true;
			}
		}
		if(!flag) {
			throw new VowelNotFoundException("No Vowels");
		}else {
			System.out.println("Vowels are present");
		}
 
}
}
 
public class VowelChecker {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check: ");
		String s = sc.nextLine();
		VowelCheckExp vw = new VowelCheckExp();
		try {
			vw.vowelChecker(s);
			System.out.println("Finished");
		}catch(VowelNotFoundException e) {
			System.out.println(e);
		}
		
 
	}
 
}