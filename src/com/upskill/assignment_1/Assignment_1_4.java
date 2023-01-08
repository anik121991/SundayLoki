package com.upskill.assignment_1;

public class Assignment_1_4 {
//A function returns 30, another function returns 50. Write a java program which will display subtraction value from bigger number to smaller.
	public static void main(String[] args) {
	
	int a=myMethod1();
    int b=	myMethod2();
    System.out.println(b-a);
	}
public static int myMethod1(){
	return 30;
}
public static int myMethod2(){
	return 50;
}
}
