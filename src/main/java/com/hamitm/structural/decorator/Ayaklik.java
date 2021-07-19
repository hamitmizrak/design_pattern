package com.hamitm.structural.decorator;

public class Ayaklik extends DecoratorKeman {

	//yeni özellikler
	private String ayaklikEklendi;

	//parametreli constructor
	public Ayaklik(IKeman ikeman,String ayaklikEklendi) {
		super(ikeman);
	this.ayaklikEklendi=ayaklikEklendi;
	}

	@Override
	public String kemanYap() {
		return super.kemanYap()+ayaklikEklendi;
	}
	
	
	
	
	
	
}
