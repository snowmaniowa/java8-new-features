package com.santha.examples;

import com.clean.builder.patterns.fluent.FluentDO;

public class HashCodeAssignedDO {

	private int id;
	private String name;

	public HashCodeAssignedDO() {
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
	
	@Override
	public boolean equals(Object obj) {
	    
		if (obj == null) {
			return false;
		}    
	    if (!(obj instanceof HashCodeAssignedDO)){
	    	return false;
	    }	       
	    if (obj == this){
	    	return true;
	    }

	    HashCodeAssignedDO kabali = (HashCodeAssignedDO) obj;
	    return (kabali.name == this.name && kabali.id == this.id);
	}	
}
