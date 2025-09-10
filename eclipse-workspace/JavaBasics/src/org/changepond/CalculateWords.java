package org.changepond;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.*;
public class CalculateWords {
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr  = new FileReader("FileHandDemo/abcd.txt");
        BufferedReader br = new BufferedReader(fr);
		String data;
		char ch[];
		data = br.readLine();
		ch = data.toCharArray();
		System.out.println(ch.length);
		String words [];
		words = data.split(" ");
		System.out.println(words.length);
	}
 
}