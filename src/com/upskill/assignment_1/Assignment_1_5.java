package com.upskill.assignment_1;

public class Assignment_1_5 {
    //Write a java program which will display name and guestimated age of every students in your class.(write separate method for every student).
	public static void main(String[] args){
		
		Assignment_1_5 obj = new Assignment_1_5();
		obj.myMethod10();
		myMethod11();
		int  a  = myMethod12();
		System.out.println("Age of z is "+ a);
	}

    public void myMethod10(){
    	int a=24;
    	System.out.println("Age of X is "+ a);
    }
    public static void myMethod11(){
    	int a=25;
    	System.out.println("Age of Y is "+ a);
    }
    public static int myMethod12(){
    	int a=26;
    	return a;
    }
}