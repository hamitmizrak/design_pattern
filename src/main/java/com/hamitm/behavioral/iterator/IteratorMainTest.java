package com.hamitm.behavioral.iterator;

public class IteratorMainTest {
	
	public static void main(String[] args) {
		
		ControlRoom controlRoom =new ControlRoom();
		
		
		for(IIterator iterator = controlRoom.getIterator(); iterator.hasNext();) {
			
			String resut= (String)iterator.next();
			System.out.println("sonuc: "+resut);
		}
		
	}
	
}
