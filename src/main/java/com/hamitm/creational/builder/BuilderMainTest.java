package com.hamitm.creational.builder;

public class BuilderMainTest {
	
	public static void main(String[] args) {
	
		//builder yoksa
		NoBuilderClass noBuilderClass=new NoBuilderClass("mızrak");
		System.out.println(noBuilderClass);
		
		System.out.println("************************************");
		
		//creationBuilder
		CreationBuilder builder=new CreationBuilder.Builder().name("Hamit").surname("mızrak").build();
		System.out.println(builder);
		
         System.out.println("************************************");
		
		//creationBuilder
		LombokBuilder lombokBuilder=new LombokBuilder.LombokBuilderBuilder().surname("Mızrak").age(36).build();
		System.out.println(lombokBuilder);
		
	}
	
}
