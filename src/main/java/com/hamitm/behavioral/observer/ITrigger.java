package com.hamitm.behavioral.observer;


//Observable
public interface ITrigger {
	
	public void addTrigger(IObserver iObserver);
	public void removeTrigger(IObserver iObserver);
	public void messageShow();
}
