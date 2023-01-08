package com.upskill.java_6;

public class Singleton {
   // Singleton is class that can only one object
	//private constructor , it prevents any other class from instantiating

   private Singleton(){
	 
 }
 
//private static object of the class
   private static Singleton SingletonObj = new Singleton();
  
  public static Singleton getInstance(){   //(factory method)
	 return SingletonObj;
   }
 protected static  void demo(){
	   System.out.println("Demo method for singleton class");
   }
   
 
   
}