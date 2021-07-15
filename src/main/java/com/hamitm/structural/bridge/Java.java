package com.hamitm.structural.bridge;

public class Java extends Yazilimci {
	
	// parametresiz constructor
	public Java() {
		super();
		
	}
	
	// parametreli constructor
	public Java(ITeknolojiler iTeknolojiler, String yazilimciAdi) {
		super(iTeknolojiler, yazilimciAdi);
		
	}
	
	@Override
	public void kodlama() {
		System.out.println(getYazilimciAdi().concat(" Hamit Mızrak ").concat(getiTeknolojiler().teknolojiAdi().concat(" Java ")));
		
	}
	
}

