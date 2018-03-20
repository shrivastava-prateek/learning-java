/*This is main application for testing synchronization */
package com.synchronization;
public class ThreadMain {
	public static void main(String[] args) {
		//create 3 threads
		//threads will access printmsg()
		
		Resource resource = new Resource();
		new ResourceThread(resource, "Hello");
		new ResourceThread(resource, "World");
		new ResourceThread(resource, "multithreading");
	}

}
/*
	[ Hello ]
	[ World ]
	[ multithreading ]
*/