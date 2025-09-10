package org.changepond;

interface show{
	void disp1();
	void disp2(int a);
	void disp3(int a, int b);
}

public class InterfaceDemo1 implements show {
	public void disp1() {
		System.out.println("disp1");
	}
	public void disp2(int a) {
		System.out.println("disp2"+a);
	}
	public void disp3(int a,int b) {
		System.out.println("disp3"+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		}
	}

}
