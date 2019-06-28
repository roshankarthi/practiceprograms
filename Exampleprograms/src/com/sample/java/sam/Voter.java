package com.sample.java.sam;

import java.util.Scanner;

public class Voter {
	int n;
	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		 n= scan.nextInt();
		 
		
	}
	void voterId() {
		if(n>=18) {
			System.out.println("this person eligilble");
			
		}
		else
		{
			System.out.println("this person not eligible");
			
		}
	}


}
