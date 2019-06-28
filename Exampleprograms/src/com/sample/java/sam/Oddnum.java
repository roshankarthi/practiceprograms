package com.sample.java.sam;

import java.util.Scanner;

public class Oddnum {
	int num1,n;
	
	void getInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		num1 = scan.nextInt();
		
		
	}
	void odd() {
		
		
			for (int num1=1;num1<=10;num1++) {
				if(num1%2==1) {
				
					System.out.println(num1);
					
					
				}
			}
	}
			
			
				void even() {
					
					
					for (int num1=1;num1<=10;num1++) {
						if(num1%2==0) {
						
							System.out.println(num1);
							
						}
						
				
		}
				}
				
		
	
	
}
