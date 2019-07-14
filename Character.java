package com.redington.java.oops;

import java.util.Scanner;

public class Character {
     char n;
    
  public void getInput(){
	  Scanner sd = new Scanner(System.in);
	  System.out.println("enter the value");
	  n = sd.next().charAt(0);
  }
  public void getOutput(){
	  {    
		  if(n>='A'&&n<='Z'){
			  System.out.println("uppercaseletter");
		  }
		  else if(n>='a'&&n<='z'){
			  System.out.println("lowercase letter");
		  }
		  else if(n>='0'&&n<='9'){
			  System.out.println("number");
		  }
		  else {
			  System.out.println("special character");
		  }
	  }
  }
  
}
