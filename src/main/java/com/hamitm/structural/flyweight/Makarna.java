package com.hamitm.structural.flyweight;

abstract public class Makarna {
	
	public MakarnaCinsi makarnaCinsi;
	public double makarnaUzunlugu;
	public double makarnaFiyati;
	
	abstract public void makarnaUret(String unMiktari, String yagMiktari, int yumartaSayisi);
}
