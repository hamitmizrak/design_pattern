package com.hamitm.behavioral.command;

public class CommandMainTest {
	
	public static void main(String[] args) {


		String error=Command.result(new Error(), "Türkiye", "Malatya");
		System.out.println(error);
		
		System.out.println("*************************************************");
		
		String warning=Command.result(new Warning(), "Türkiye", "Ankara");
		System.out.println(warning);
		
	}
	
}
