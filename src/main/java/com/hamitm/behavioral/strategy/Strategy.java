package com.hamitm.behavioral.strategy;

public class Strategy {
	
	private IIletisim iletisim;

	//getter and setter
	public IIletisim getIletisim() {
		return iletisim;
	}

	public void setIletisim(IIletisim iletisim) {
		this.iletisim = iletisim;
	}
	
	
	//gönderme metodu
	public void gondermeBilgisi() {
		iletisim.send();
	}
	
}
