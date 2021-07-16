package com.hamitm.structural.adapter;

public class HintMutfagiAdapter implements ITurkMutfagi {
	
	private HintMutfagi hintMutfagi;
	
	public HintMutfagiAdapter(HintMutfagi hintMutfagi) {
		super();
		this.hintMutfagi = hintMutfagi;
	}
	
	@Override
	public void yemekYap() {
		System.out.println("Adapter ... hint Mutfagı ");
		
	}
	
}
