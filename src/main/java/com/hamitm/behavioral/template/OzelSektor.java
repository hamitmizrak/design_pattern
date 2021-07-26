package com.hamitm.behavioral.template;

public class OzelSektor  extends Okul{

	@Override
	void ortaOkul() {
		System.out.println("Özel sektör ortaokula gidildi");
	}

	@Override
	void lise() {
		System.out.println("Özel sektör liseye gidildi");
	}

	@Override
	void universite() {
		System.out.println("Özel sektör üniversiteye gidildi");
	}
	
}
