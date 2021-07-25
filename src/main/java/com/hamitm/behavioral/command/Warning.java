package com.hamitm.behavioral.command;

public class Warning implements LoglamaOrnegi {

	@Override
	public String loglamaTuru(String ulke, String sehir) {
		System.out.println("warning");
		return "warning"+" ULKE: "+ulke+" ŞEHİR: "+sehir;
	}
	
}
