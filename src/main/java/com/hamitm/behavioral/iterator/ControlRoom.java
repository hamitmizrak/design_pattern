package com.hamitm.behavioral.iterator;

public class ControlRoom implements Container {
	
	public String diziListesi[]= {"Hamit","Hulusi","Talha"};

	@Override
	public IIterator getIterator() {
		return new CommonClass();
	}
	
	//inner class
	private class CommonClass implements IIterator{
		
		int index;

		@Override
		public boolean hasNext() {
			if(index < diziListesi.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()) {
				return diziListesi[index++];
			}
			return null;
		}
		
	}
	
}
