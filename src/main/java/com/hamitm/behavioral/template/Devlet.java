package com.hamitm.behavioral.template;

public class Devlet  extends Okul{

	@Override
	void ortaOkul() {
		System.out.println("Devlet ortaokula gidildi");
	}

	@Override
	void lise() {
		System.out.println("Devlet liseye gidildi");
	}

	@Override
	void universite() {
		System.out.println("Devlet üniversiteye gidildi");
	}
	
}
