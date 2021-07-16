package com.hamitm.structural.adapter;

public class AdapterMainTest {
	
	public static void main(String[] args) {
		//farklı bileşenleri tek bir interface'de birleştirdik
		ITurkMutfagi iTurkMutfagi =new MalatyaMutfagi();
		iTurkMutfagi.yemekYap();
		
		System.out.println("****************************************************");
		
		iTurkMutfagi=new AntepMutfagi();
		iTurkMutfagi.yemekYap();
		
		System.out.println("****************************************************");
		
		HintMutfagi hintMutfagi=new HintMutfagi();
		iTurkMutfagi=new HintMutfagiAdapter(hintMutfagi);
		iTurkMutfagi.yemekYap();
		
	}
	
}
