package com.hamitm.structural.composite;

public class CompositeMainTest {
	
	public static void main(String[] args) {
		
		AcemiBirligi acemiBirligi=new AcemiBirligi("Kütahya Havacı");
		AcemiBirligi acemiBirligi2=new AcemiBirligi("Malatya Havacı");
		
		UstaBirligi ustaBirligi=new UstaBirligi("İzmir Havacılar Kampı");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		ustaBirligi.ekle(acemiBirligi);
		ustaBirligi.ekle(acemiBirligi2);
		ustaBirligi.askerAdimAt();
		
	}
	
}
