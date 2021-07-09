package com.hamitm.creational.builder;

// Builder: 1.adım toString
// Builder: 2.adım innerClass
public class CreationBuilder {
	
	private String name;
	private String surname;
	
	// parametresiz constructor
	public CreationBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli innerClass constructor
	public CreationBuilder(Builder builder) {
		this.name = builder.name;
		this.surname = builder.surname;
		
	}
	
	// toString
	@Override
	public String toString() {
		return "BuilderClass [name=" + name + ", surname=" + surname + "]";
	}
	
	// getter and setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/////////////////////////////////////////////////////
	
	// 2.ADIM innerclass
	// Normalda: 1 tane public class vardır, static class yoktur.(inner
	// classlarhariç)
	public static class Builder {
		private String name;
		private String surname;
		
		// parametresiz constructor metotlar
		public Builder() {
		}
		
		// parametreli metotlar
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder surname(String surname) {
			this.surname = surname;
			return this;
		}
		
		// CreationBuilder
		public CreationBuilder build() {
			return new CreationBuilder(this);
		}
		
	}
	
}
