package com.upskill.java_6;

public class MultiThreading {
	
	/* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */

	public static void main(String[] args) throws InterruptedException  {
//		int n = 10;
//	for (int i = 0; i < 10; i++){
//
//			MultithreadingThread obj = new MultithreadingThread();
//			obj.start();
//			
//			Thread obj2 = new Thread(new MultithreadingThread());
//			obj2.start();
//		}

	

	
	
//-----------------------------------------------------------------------------------------------------------//	
	
	
	
	
	
	
	
	

	
	
	
	
		MultithreadingThread obj =new MultithreadingThread();
		//obj.print();  
		obj.start();
	

		
			for(int i = 0; i < 5; i++){
				System.out.println(2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					//e.printStackTrace();
				}
	
	
	
	
			}
	}	
}