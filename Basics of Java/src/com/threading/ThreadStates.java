package com.threading;

import java.util.Scanner;

class Demo extends Thread {
	Scanner sc = new Scanner(System.in);
	
	public Demo(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(getName() + " is running #" + getId());
		sc.next();
		System.out.println("State after reading input :: " + getState());
	}

}

public class ThreadStates {

	public static void main(String[] args) throws InterruptedException {
		Demo d1 = new Demo("Thread 1");
		
		System.out.println("State before starting:: " + d1.getState());
		d1.start();
		d1.join();
		System.out.println("State after starting:: " + d1.getState());
	}

}
