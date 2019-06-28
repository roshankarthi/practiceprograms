package com.sample.java.sam;

import java.util.Scanner;

public class Squarepro {
	int square;
	int cube;
	int number;
	
	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		number = scan.nextInt();
		
		
		
	}
	void display() {
		square = number*number;
		System.out.println(square);
		cube = number*number*number;
		System.out.println(cube);
		
	}

}
