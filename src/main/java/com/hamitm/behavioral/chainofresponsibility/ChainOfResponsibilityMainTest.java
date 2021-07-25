package com.hamitm.behavioral.chainofresponsibility;

public class ChainOfResponsibilityMainTest {
	
	public static void main(String[] args) {
		
		Upload upload=new Upload("doğa resimi", "special");
		
		Special special=new Special();
		OtherUpload otherUpload=new OtherUpload();
		
		
		special.setNextUpload(otherUpload);
		special.uploadImage(upload);
	}
	
}
