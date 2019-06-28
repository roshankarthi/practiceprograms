package com.sample.java.sam;

import java.util.Scanner;

public class Betweenrange {

	int i,n;
	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		 n= scan.nextInt();
		 
		
	}
	void display() {
		for(i=10;i<=n;i++) {
			System.out.println(i);
			
		}
	}
	
}
