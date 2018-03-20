package com.interthreadcommunication;
public class ConsumerThread extends Thread{
	IntResource resource;
	public ConsumerThread(IntResource resource) {
		this.resource = resource;
		start();
	}
	@Override
	public void run() {
		while (true){
			resource.getVar();
		}
	}
}
