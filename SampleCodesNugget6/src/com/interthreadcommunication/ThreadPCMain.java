package com.interthreadcommunication;
public class ThreadPCMain {
	public static void main(String[] args) {
		IntResource resource = new IntResource();
		new ProducerThread(resource);
		new ConsumerThread(resource);
	}
}
