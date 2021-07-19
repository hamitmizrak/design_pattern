package com.hamitm.creational.factory;

public class BilgisayarFabrikasi {
	
	public static IBilgisayar getBilgisayar(String bilgisayarAdi) {
		
		if("msi".equalsIgnoreCase(bilgisayarAdi))
			return new Msi();
		else if ("mac".equalsIgnoreCase(bilgisayarAdi))
			return new Mac();
		else {
			System.out.println("Farklı bilgisayar seçtiniz....");
		}
		
		return null;
	}
}
