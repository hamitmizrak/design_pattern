package com.hamitm.structural.bridge;

public class Html5 extends Yazilimci {
	
	// parametresiz constructor
	public Html5() {
		super();
		
	}
	
	// parametreli constructor
	public Html5(ITeknolojiler iTeknolojiler, String yazilimciAdi) {
		super(iTeknolojiler, yazilimciAdi);
		
	}
	
	@Override
	public void kodlama() {
		System.out.println(getYazilimciAdi().concat(" Hamit Mızrak ").concat(getiTeknolojiler().teknolojiAdi().concat(" Html5 ")));
		
	}
	
}
