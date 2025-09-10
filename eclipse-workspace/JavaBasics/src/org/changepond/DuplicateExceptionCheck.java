package org.changepond;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
 
class DuplicateException extends Exception{
	DuplicateException(String s){
		super(s);
	}
}
 
class DuplicateChecker{
	void duplicateNumberCheck(String path) throws NumberFormatException, IOException, DuplicateException {
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		List<Integer> lst = new ArrayList<Integer>();
		String line;
		while((line=br.readLine())!=null) {
			int num = Integer.parseInt(line.trim());
			lst.add(num);
		}
		boolean flag = false;
		for(int i=0;i<lst.size();i++) {
			for(int j=i+1;j<lst.size();j++) {
				int a = lst.get(i);
				int b = lst.get(j);
				if(a==b) {
					flag = true;
					break;
				}
			}
		}
		if(flag) {
			throw new DuplicateException("Duplicate number");
		}else {
			System.out.println("Numbers are unique");
		}
		
	}
}
 
public class DuplicateExceptionCheck {
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		DuplicateChecker dc = new DuplicateChecker();
		String path = "myFolder/number.txt";
		try {
			dc.duplicateNumberCheck(path);
		}catch(DuplicateException e) {
			System.out.println(e);
		}
		
	}
 
}