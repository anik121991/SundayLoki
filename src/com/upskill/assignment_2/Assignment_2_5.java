package com.upskill.assignment_2;

public class Assignment_2_5 {

	public static void main(String[] args) {
	myMethod();

	}
  public static void myMethod(){
	  int row;
	  int col;
	  for(row=1; row<=8; row++){
      for(col=1; col<=8; col++){
    	  int multipicationTable = row * col;
    	  System.out.print(multipicationTable+" ");
      }
      System.out.println(" ");
	  }
  }
}
