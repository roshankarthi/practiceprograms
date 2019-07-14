package com.redington.java.oops;

import java.util.Scanner;

public class Prime {
	int n;
	
	public void getInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		 n =sc.nextInt();
		
	}
	public void PrimeOrNot(){
	
		int check = 0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				check=1;
				break;
				
			}
		}
		if(check==0){
			System.out.println("its prime number");
		}
		else{
			System.out.println("not a prime number");
		}
	}

}
