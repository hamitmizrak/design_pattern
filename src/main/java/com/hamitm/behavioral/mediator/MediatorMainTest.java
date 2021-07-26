package com.hamitm.behavioral.mediator;

public class MediatorMainTest {
	
	public static void main(String[] args) {
		
		
		Student hamit=new Student("Hamit");
		hamit.mesajGonder("Nasılsın Hamit");
		
		System.out.println("****************************************");
		
		Student hulusi=new Student("Hulusi");
		hulusi.mesajGonder("Nasılsın hulusi");
		
	}
	
}
