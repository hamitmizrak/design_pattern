package com.hamitm.behavioral.observer;

public class ObserverMainTest {
	
	public static void main(String[] args) {
		PushNotification pushNotification=new PushNotification();
		Message message=new Message();
		message.pushNotification("Merhabalar");
		message.pushNotification("Merhabalar-2");

		
		message.setTrigger(pushNotification);
		pushNotification.addTrigger(message);
		pushNotification.removeTrigger(message);
		pushNotification.messageShow();
		
	}
	
}
