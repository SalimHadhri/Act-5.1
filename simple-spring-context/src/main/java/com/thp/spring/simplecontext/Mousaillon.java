package com.thp.spring.simplecontext;




public class Mousaillon {

	
	private String firstName ;
	private String lastName ;
	private String config ;
	
	
	
	public Mousaillon() {
	}



	public Mousaillon(String firstName, String lastName, String config) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.config = config;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getConfig() {
		return config;
	}



	public void setConfig(String config) {
		this.config = config;
	}
	
	
	
	
}
