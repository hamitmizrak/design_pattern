package com.hamitm.behavioral.command;

public class Error implements LoglamaOrnegi {

	@Override
	public String loglamaTuru(String ulke, String sehir) {
		System.out.println("error");
		return "error"+" ULKE: "+ulke+" ŞEHİR: "+sehir;
	}
	
}
