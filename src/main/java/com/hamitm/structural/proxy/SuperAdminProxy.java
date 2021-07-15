package com.hamitm.structural.proxy;

public class SuperAdminProxy implements SpecialComputerCode{

	private SuperAdmin superAdmin;
	private String userEmail;
	private String userPassword;
	
	
	
	
	//parametreli constructor
	public SuperAdminProxy(String userEmail, String userPassword) {
		super();
		this.superAdmin=new SuperAdmin();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	//email ve şifreyle superAdmin olup olmadığına bakıyoruz
	public boolean isSuperAdmin() {
		boolean isSuperAdmin=false;
		boolean isUserEmail=PersonList.isUserEmail(userEmail,userPassword);
		
		if(isUserEmail) {
			Person person=PersonList.getPersonEmailAddress(userEmail);
			isSuperAdmin=person.isSuperAdmin();
		}
		return isSuperAdmin;
	}




	@Override
	public String getComputerCode() {
		boolean result=isSuperAdmin();
		if(result) 
			return superAdmin.getComputerCode();
		else 
			System.out.println("Yetkiniz yoktur");
		return null;
		
	}

	
}
