package org.changepond;
 
class NoIsOddException extends Exception{
	NoIsOddException(String s){
		super(s);
	}
}
public class CustomCheckedDemo {
	
	void checkNumber(int no) throws NoIsOddException{
		if(no%2!=0)//6
		{
			throw new NoIsOddException("Given no is odd");
		}
		else {
			System.out.println("no is even number");		}
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomCheckedDemo obj = new CustomCheckedDemo();
		try {
			obj.checkNumber(3);
		}
		catch(NoIsOddException e)
		{
//			System.out.println(e);
//			System.out.println(e);
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
			e.printStackTrace();//exception name and desc
		}
 
	}
 
}