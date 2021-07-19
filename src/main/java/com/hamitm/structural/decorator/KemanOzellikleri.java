package com.hamitm.structural.decorator;

public class KemanOzellikleri implements IKeman {
	
	private int telSayisi;
	private int burguSayisi;
	

	//parametreli constructur
	public KemanOzellikleri(int telSayisi, int burguSayisi) {
		super();
		this.telSayisi = telSayisi;
		this.burguSayisi = burguSayisi;
	}


	@Override
	public String kemanYap() {
		return this.telSayisi+" "+burguSayisi;
	}
	
	
}
