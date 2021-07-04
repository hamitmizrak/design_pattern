package com.hamitm.creational.prototype;

public class PrototypeMainTest {
	
	public static void main(String[] args) {
		//MultipleDatabasePrototype databases=new MultipleDatabasePrototype();
		//System.out.println(databases.getUrl());
		//System.out.println(databases.getDbName());
		
		MultipleDatabasePrototype mysql=new Mysql();
		System.out.println(mysql.hashCode());
		System.out.println(mysql.toString());
		
		System.out.println("************************************************************");
		//Asıl olayın gerçekleştiği yer
		try {
			MultipleDatabasePrototype mssql=(MultipleDatabasePrototype) mysql.clone();
			mssql.setDbName("mssql");
			System.out.println(mssql);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	
}
