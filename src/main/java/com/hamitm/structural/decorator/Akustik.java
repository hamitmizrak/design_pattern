package com.hamitm.structural.decorator;

public class Akustik extends DecoratorKeman {

	//yeni özellikler
	private String akustikSesEklendi;

	//parametreli constructor
	public Akustik(IKeman ikeman,String akustikSesEklendi) {
		super(ikeman);
	this.akustikSesEklendi=akustikSesEklendi;
	}

	@Override
	public String kemanYap() {
		return super.kemanYap()+akustikSesEklendi;
	}
	
	
	
	
	
	
}
