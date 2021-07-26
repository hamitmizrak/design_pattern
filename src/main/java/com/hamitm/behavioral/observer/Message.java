package com.hamitm.behavioral.observer;

public class Message implements IObserver{
	
	private ITrigger trigger;
	public Message() {
	
	}
	
	public Message(ITrigger trigger) {
		super();
		this.trigger = trigger;
	}


	@Override
	public void pushNotification(String cumle) {
		System.out.println("mesajımız: "+cumle);
		
	}
	
	public void deleteTrigger() {
		trigger.removeTrigger(this);
	}


	//getter and setter
	public ITrigger getTrigger() {
		return trigger;
	}


	public void setTrigger(ITrigger trigger) {
		this.trigger = trigger;
	}
	
	
	
	
	
	
}
