package com.hamitm.structural.decorator;

abstract public class DecoratorKeman implements IKeman {
	
	// interface çağırmak
	protected IKeman ikeman;
	
	public DecoratorKeman(IKeman ikeman) {
		super();
		this.ikeman = ikeman;
	}
	
	@Override
	public String kemanYap() {
		return ikeman.kemanYap();
	}
	
}
