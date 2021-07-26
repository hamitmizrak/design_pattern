package com.hamitm.behavioral.memento;

public class Originator {
	
	//nesne değişkeni
	private String durum;

	//getter and setter
	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}
	

	//method
	public Memento saveStateToMemento() {
		return new Memento(durum);
	}
	
	public void getStateFromMemento(Memento memento) {
		durum=memento.getDurum();
	}
	
	
}
