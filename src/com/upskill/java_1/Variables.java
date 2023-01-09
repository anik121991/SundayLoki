package com.upskill.java_1;

public class Variables {

//  Variable in Java
	
	public String country = "USA";  //Instance OR global variable - Variables declared in Class level, outside method (and is not declared with static key word)
        
	public String country2 = "Russia";   
	
	 public static String region = "America";   //Static variable - variables belong to class and don't required creating object(declared with static keyword)
	 
	 public static void main(String[] args)  {
		 
		 String city = "New York";            //Local variable - variables declared in methods (A variable that is declared inside the method)
		 
		 method("Dhak");
		  
    }

    public static void method(String county){     //Method parameter - variables used as method parameter (if data is to be brought inside the method from outside the method  
    	
    	
    	
    	String myCounty = county;
    	
    	System.out.println(county);

    }
    
    public void test(){
    	//git test
    	int a = 666;
	}

}












































