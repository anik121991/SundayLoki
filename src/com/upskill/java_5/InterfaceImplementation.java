package com.upskill.java_5;

public class InterfaceImplementation implements Interface  {

	@Override
	public void iDoor() {
		  System.out.println("My car has 2 door !");
		
	}

	@Override
	public int iWheel() {
		 System.out.println("My car has 4 Wheel !");
		return 4;
	}

	@Override
	public String iEngine() {
		 System.out.println("My car has 5 hp engine !");
		return "5 hp";
	}
 public static void main(String[] args){
	 InterfaceImplementation it=new InterfaceImplementation();
		it=new InterfaceImplementation();
		it.iDoor();
		it.iWheel();
		it.iEngine();
	}
 }



































