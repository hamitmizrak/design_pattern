package com.hamitm.creational.singleton;

public class SingletonMainTest {
	
	public static void main(String[] args) {
		//nw ile olusturamazsın
		//SingletonDbConnection singleton=new SingletonDbConnection();
		
		SingletonDbConnection.getInstace();
		SingletonDbConnection.getInstace2();
		
		
	}
	
}
