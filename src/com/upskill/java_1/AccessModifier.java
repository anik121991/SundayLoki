package com.upskill.java_1;

public class AccessModifier {

     public String name =  "Anik";                  // public - Any class can access (if we want to access this in different package we can be access easily)
    		
     private int age = 29;                          // private - Only same class can access (we can't access another class, suppose we have another class name is DataType we can't be access this private member in there)
     
     protected int ssn = 123234;                    // protected - classes in the same package and subclass(we can use in other package by inheritance this is more restrictive then the public modifier)
         
         String address = "Heritage Tower";         // default - classes in same package can access(if we don't use modifier this is called default)

	
//git test
         int a = 5;
}

 



















