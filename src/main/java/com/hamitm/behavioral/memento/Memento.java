package com.hamitm.behavioral.memento;

public class Memento {
	
	private String durum;
	
	

	public Memento(String durum) {
		super();
		this.durum = durum;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}
	
	
}
