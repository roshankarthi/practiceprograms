package com.sample.java.sam;

import java.util.Scanner;

public class Average {
    int number1;
    int number2;
    int number3;
    
    void getInput() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("enter the number1");
    	number1 = scan.nextInt();
    	System.out.println("enter the number2");
    	number2 = scan.nextInt();
    	System.out.println("enter the number1");
    	number3 = scan.nextInt();
    	
    	
    	
    }
    
    void add() {
    	
    int	add = number1+number2+number3;
    	System.out.println(add);
    	
    }
    void sub() {
    	int sub = number1-number2-number3;
    	System.out.println(sub);
    }
    void mul() {
    	int mul = number1*number2*number3;
    	System.out.println(mul);
    	
    }
    void div() {
    	int div =(number1/number2/number3);
    	System.out.println(div);
    	
    }
    void avg() {
    	int avg = ((number1+number2+number3)/3);
    	System.out.println(avg);
    	
    }
}
