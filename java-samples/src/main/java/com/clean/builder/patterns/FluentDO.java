package com.clean.builder.patterns;

public class FluentDO {

	private int id;
	private String firstName;
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
	public FluentDO setId(int id) {
		this.id = id;
		return this;
	}

	public FluentDO setFirstName(String firstName) {
		this.firstName = firstName;
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

	public String getLastName() {
		return lastName;
	}

	public String getAge() {
		return age;
	}

	public String getOccupation() {
		return occupation;
	}

	public int getId() {
		return id;
	}

	public void printValues() {
		System.out.println("Id: " + getId());
		System.out.println("FName: " + getFirstName());
		System.out.println("LName: " + getLastName());		
		System.out.println("Age: " + getAge());
		System.out.println("Occupation: " + getOccupation());
	}

	@Override
	public boolean equals(Object obj) {
	    
		if (obj == null) {
			return false;
		}
    
	    if (!(obj instanceof FluentDO)){
	    	return false;
	    }
	        
	    if (obj == this){
	    	return true;
	    }
	        
	    return this.getId() == ((FluentDO) obj).getId();
	}	
		
}
