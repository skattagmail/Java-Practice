package com.java.threads;

public class ThreadExample2 implements Runnable{
	
	public void run() {		//Running state
		for(int i=1; i<=12; i++) {
			try {
				Thread.sleep(1000);	//Non-Runnable
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i % 2 ==0)
					System.out.println(i + "  is an even number" + "---" + Thread.currentThread().getName());
		}
	}  //Terminated

	public static void main(String[] args) {
		ThreadExample2 th1 = new ThreadExample2();
		Thread t1 = new Thread(th1);
		t1.start();
		
		ThreadExample2 th2 = new ThreadExample2();
		Thread t2 = new Thread(th2);
		t2.start();
	}
}
