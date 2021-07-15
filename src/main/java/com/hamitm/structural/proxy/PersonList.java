package com.hamitm.structural.proxy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PersonList {
	
	//Kişi listesini fake ekleyelim.
	public static List<Person> getPersonList(){
		Person person1=  new Person("hamitmizrak@gmail.com", "root", true);
		Person person2=  new Person("deneme@gmail.com", "deneme", false);
		List<Person> personList=new ArrayList<Person>();
		personList.add(person1);
		personList.add(person2);
		return personList;
	}
	
	//1.part: kişinin email adresinden ==> Person objesine erişmek için Map yazalım
	public static Map<String, Person> getUserEmailMap(){
		List<Person> personList=getPersonList();
		Map<String, Person> personMapList=new LinkedHashMap<String, Person>();
		
		for(Person person:personList) {
			personMapList.put(person.getUserEmail(), person);
		}
		return personMapList;
	}
	
	
	//2.part: kişinin email adresinden ==> Person objesine erişmek için Map'i kullanalım.
	public static Person getPersonEmailAddress(String userEmail) {
		Map<String,Person> personMap=getUserEmailMap();
		Person person=personMap.get(userEmail);
		return person;
	}
	
	public static boolean isUserEmail(String userEmail,String userPassword) {
		boolean result=false;
		Person person=getPersonEmailAddress(userEmail);
		
		if(person!=null) {
			result=person.getUserPassword().equals(userPassword);
		}
		return result;
	}
}
