package com.hamitm.creational.builder;

import java.util.Date;

public class NoBuilderClass {
	
	private String name;
	private String surname;
	private String country;
	private int age;
	private String emailAddres;
	private Date date;
	
	// parametresiz constructor
	public NoBuilderClass() {
		// TODO Auto-generated constructor stub
	}
	
	// parametreli constructor
	public NoBuilderClass(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public NoBuilderClass(String surname) {
		this.surname = surname;
	}
	
	


	public NoBuilderClass(String country,String emailAddres) {
		this.country = country;
		this.emailAddres = emailAddres;
	}

	public NoBuilderClass(String name, String surname, String country) {
	
		this.name = name;
		this.surname = surname;
		this.country = country;
	}

	public NoBuilderClass(String name, String surname, String country, int age) {
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.age = age;
	}

	public NoBuilderClass(String name, String surname, String country, int age, String emailAddres) {
		super();
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.age = age;
		this.emailAddres = emailAddres;
	}

	public NoBuilderClass(String name, String country, int age) {
		super();
		this.name = name;
		this.country = country;
		this.age = age;
	}

	public NoBuilderClass(String name, String surname, String country, int age, String emailAddres, Date date) {
		super();
		this.name = name;
		this.surname = surname;
		this.country = country;
		this.age = age;
		this.emailAddres = emailAddres;
		this.date = date;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailAddres() {
		return emailAddres;
	}

	public void setEmailAddres(String emailAddres) {
		this.emailAddres = emailAddres;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "BuilderClass [name=" + name + ", surname=" + surname + ", country=" + country + ", age=" + age
				+ ", emailAddres=" + emailAddres + ", date=" + date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((emailAddres == null) ? 0 : emailAddres.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoBuilderClass other = (NoBuilderClass) obj;
		if (age != other.age)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (emailAddres == null) {
			if (other.emailAddres != null)
				return false;
		} else if (!emailAddres.equals(other.emailAddres))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
	
	

	
	
	
}
