package com.threading;

//class MyThread extends Thread {
//	String name;
//
//	public MyThread(String name) {
//		super(name);
//		this.name = name;
//	}
//
//	@Override
//	public void run() {
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(name + " is saying Hello!!! #" + i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

class MyThread implements Runnable {

	String name;

	public MyThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + " is saying Hello!!! #" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Started");

//		MyThread t1 = new MyThread("Thread 1");
//		MyThread t2 = new MyThread("Thread 2");
//		MyThread t3 = new MyThread("Thread 3");
//		MyThread t4 = new MyThread("Thread 4");
//
//		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();

		Thread t1 = new Thread(new MyThread("Thread 1"));
		Thread t2 = new Thread(new MyThread("Thread 2"));
		Thread t3 = new Thread(new MyThread("Thread 3"));
		Thread t4 = new Thread(new MyThread("Thread 4"));

		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

		System.out.println("Main Ended");
	}

}
