package com.interthreadcommunication;
public class ProducerThread extends Thread{
	IntResource resource;
	public ProducerThread(IntResource resource) {
		this.resource = resource;
		start();
	}
	
	@Override
	public void run() {
		int count = 0;
		while(true){
			
			resource.setVar(count++);
		}
		
	}
	
	
}
