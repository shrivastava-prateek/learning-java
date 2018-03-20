package com.interthreadcommunication;
public class IntResource {
	private int var;
	boolean flag = false;
	public synchronized int getVar() {
		if(flag == false){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("GOT: " + var);
		flag = false;
		notify();
		return var;
	}

	public synchronized void setVar(int var) {
		if(flag == true){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.var = var;
		System.out.println("SET: " + var);
		flag = true;
		notify();
	}
	
	
}
