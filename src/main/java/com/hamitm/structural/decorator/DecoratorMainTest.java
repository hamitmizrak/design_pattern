package com.hamitm.structural.decorator;

public class DecoratorMainTest {
	
	public static void main(String[] args) {
		IKeman iKeman=new Akustik(new Ayaklik(new KemanOzellikleri(4, 4), " ayaklık Eklendi") , " akustik Ses Eklendi");
		String result=iKeman.kemanYap();
		System.out.println(result);
		
	}
	
}
