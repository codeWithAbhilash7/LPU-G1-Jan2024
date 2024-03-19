package com.threading;

class DaemonThreadExample extends Thread {
	public DaemonThreadExample(String name) {
		super(name);
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.println(getName() + " thread is Cleaning!!!");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DaemonThreadExample cleaner = new DaemonThreadExample("Cleaner");
		cleaner.setDaemon(true);
		cleaner.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main is working...");
			Thread.sleep(500);
		}
		System.out.println("Main has finished working...");
	}

}
