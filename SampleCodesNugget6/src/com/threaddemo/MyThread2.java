/* This application demostrates how to create thread and how main method and child thread execute simultaniously*/
package com.threaddemo;
public class MyThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread: " + i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyThread2 t2 = new MyThread2();
		t2.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main method: " + i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
