package com.hamitm.structural.flyweight;

public class KelebekMakarna extends Makarna  {

	public KelebekMakarna(double makarnaFiyati,double makarnaUzunlugu) {
		super();
		this.makarnaCinsi=MakarnaCinsi.fiyonk;
		this.makarnaFiyati= makarnaFiyati;
		this.makarnaUzunlugu=makarnaUzunlugu;
	}

	@Override
	public void makarnaUret(String unMiktari, String yagMiktari, int yumartaSayisi) {
		System.out.println("kelebek makarna Tarif: "+"un: "+unMiktari+ " yağ: "+yagMiktari+" yumurta:" + yumartaSayisi  );
	}
	
}
