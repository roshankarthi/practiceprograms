package com.redington.java.oops;
import java.util.Scanner;
public class Primerange {
	

		int k,l;
		
		public void getInput(){
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the first range");
			 k = sc.nextInt();
			System.out.println("enter the second range");
			l = sc.nextInt();
			
			//System.out.println("ENTER THE NUMBER");
			// n =sc.nextInt();
			
			 		 
			 
			
		}
		public void PrimeOrNot(){
		for(int j =k;j<l;j++){
			
			int check = 0;
			for(int i=2;i<j;i++){
				if(j%i==0){
					check=1;
					
					break;
					
				}
			}
			if(check==0){
				System.out.println(j+" is prime number");
				//break;
			}
			else{
				System.out.println(j+" not a prime number");
				//break;
			}
		}

	}


}
