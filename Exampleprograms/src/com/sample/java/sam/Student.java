package com.sample.java.sam;

import java.util.Scanner;

public class Student {
   String name;
   String rollno;
   String interst;
  void getInput() {
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.print("enter the name");
	  name = scan.next();
	  System.out.print("enter the rollno");
	  rollno = scan.next();
	  System.out.print("enter the interst");
	  interst = scan.next();
	  
	  
	  
	   
   }
  void display() {
	  System.out.println("my name is "+name);
	  System.out.println("my rollno is "+rollno);
	  System.out.println("my interst is "+interst);
	  
	  
  }
  
}
