package com.java.threads;

public class ThreadExample1 extends Thread{
	
	public void run() {		//Running state
		for(int i=1; i<=12; i++) {
//			try {
//				Thread.sleep(1000);	//Non-Runnable
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			if (i % 2 ==0)
					System.out.println(i + "  is an even number" + "---" + Thread.currentThread().getName());
		}
	}  //Terminated
	
	public static void main(String[] args) {
		ThreadExample1 th1 = new ThreadExample1();	//New State
		th1.setName("Reader Thread - 01");
		th1.run(); //Runnable
		
		ThreadExample1 th2 = new ThreadExample1();
		th2.setName("Reader Thread - 02");

		th2.run();
	}

}
