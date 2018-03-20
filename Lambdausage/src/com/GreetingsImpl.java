package com;

public class GreetingsImpl implements Greetings {

	@Override
	public void greet(String name) {
		System.out.println("Hello "+name);	
	}

}
