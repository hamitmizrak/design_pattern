package com.hamitm.structural.bridge;

public class BridgeStructuralMainTest {
	
	public static void main(String[] args) {
		Yazilimci fro=new Html5(new FrondEnd(),"HamitM.");
		fro.kodlama();
		
		System.out.println("****************************************");
		
		Yazilimci back=new Java(new BackEnd(),"HamitM.");
		back.kodlama();
		
	}
	
}
