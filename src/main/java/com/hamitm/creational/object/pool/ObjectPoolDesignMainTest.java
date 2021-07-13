package com.hamitm.creational.object.pool;

public class ObjectPoolDesignMainTest {
	
	public static void main(String[] args) {
		UsesObjectDesign usesObjectDesign=ObjectPoolDesign.getObjectPoolDesign().getUsesObjectDesign();
		// kodlarımızda işlemleri yapıyoruz.
		//...
		//...
		//...
		
		//işlemimiz bitti havuza iade ediyorum
		ObjectPoolDesign.getObjectPoolDesign().lendItBack(usesObjectDesign);
		
		
		
	}
	
}
