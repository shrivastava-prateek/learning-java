/*This application demonstrates how to create thread by implementing Runnable interface */
package com.threaddemo;
public class MyThread3 implements Runnable {

	@Override
	public void run() {
		System.out.println("inside run");
	}
	public static void main(String[] args) {
		MyThread3 t3 = new MyThread3();
		Thread t = new Thread(t3);
		t.start();
	}
}
