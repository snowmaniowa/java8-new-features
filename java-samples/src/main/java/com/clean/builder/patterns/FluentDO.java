package com.clean.builder.patterns;

public class FluentDO {

	private String firstName;
	private String middleName;
	private String lastName;
	private String age;
	private String occupation;
	
	public FluentDO(){		
	}

	//1: Create  constructor with 'static' accessor
	public static FluentDO create(){
		return new FluentDO();
	}

	//2. All setters must return this
	public FluentDO setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public FluentDO setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}

	public FluentDO setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public FluentDO setAge(String age) {
		this.age = age;
		return this;
	}

	public FluentDO setOccupation(String occupation) {
		this.occupation = occupation;
		return this;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAge() {
		return age;
	}

	public String getOccupation() {
		return occupation;
	}

	public void printValues() {

		System.out.println("" + getFirstName());
		System.out.println("" + getLastName());
		System.out.println("" + getMiddleName());
		System.out.println("" + getAge());
		System.out.println("" + getOccupation());
	}
		
}
