package com.upskill.java_6;

public class MultithreadingThread extends Thread{

//	public void run(){
//		try{
//			System.out.println("Thread Number # " + Thread.currentThread().getId() + " is Running");
//		}catch (Exception e){
//			System.out.println("Exception is caught");
//		}
//	}
	
	
	
	
	
	
//--------------------------------------------------------------------------------------------//	
	
	
	
	
	
	
	
	
	public void run(){
		for(int i = 0; i < 5 ; i++){
			System.out.println(1);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
