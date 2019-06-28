package com.sample.java.sam;

import java.util.Scanner;

public class Stringpro {
	String name1;
	String name2;
	
	
	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the one name");
		name1 = scan.next();
		System.out.println("enter the another name");
		name2 = scan.next();
		
		
	}
	void display() {
		  String name3 = (name1+name2);
		  System.out.println(name3);
		  
		  
	}

}
