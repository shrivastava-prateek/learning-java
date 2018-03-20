package com;
import java.io.Console;


public class ConsoleDemo {
	public static void main(String[] args) {
		Console console = System.console();
		String name = console.readLine("Enter name: ");
		System.out.println(name);
		char ch[] = console.readPassword("Enter password: ");
		System.out.println(ch);
	}
}
