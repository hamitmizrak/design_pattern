package com.hamitm.structural.proxy;

public class ProxyMainText {
	
	public static void main(String[] args) {
		SuperAdminProxy superAdminProxy=new SuperAdminProxy("hamitmizrak@gmail.com", "root");
		//SuperAdminProxy superAdminProxy=new SuperAdminProxy("deneme@gmail.com", "deneme");
		
		String special=superAdminProxy.getComputerCode();
		System.out.println(special);
		
	}
	
}
