/*This application demonstrates how to create multiple threads  */
package com.threaddemo;
public class MultipleThread extends Thread {
	public MultipleThread(String name) {
		setName(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName()+" : " + i);
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		//create 3 threads
		MultipleThread t1  = new MultipleThread("one");
		MultipleThread t2  = new MultipleThread("two");
		MultipleThread t3  = new MultipleThread("three");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		t1.setPriority(9);
		t2.setPriority(6);
		t3.setPriority(2);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
