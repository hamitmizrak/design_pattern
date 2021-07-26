package com.hamitm.behavioral.chainofresponsibility;

abstract public class NextUpload {
	
	protected NextUpload nextUpload;

	//getter and setter
	public NextUpload getNextUpload() {
		return nextUpload;
	}

	public void setNextUpload(NextUpload nextUpload) {
		this.nextUpload = nextUpload;
	}
	
	//method
   abstract public  void uploadImage(Upload upload);
	
}
