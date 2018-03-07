package com.santha.examples;

import com.clean.builder.patterns.fluent.FluentDO;

public class EqualsHashCode {

	public static void main(String[] args) {

		System.out.println("==== Default Hashcode = shallow comparision ===");
		HashCodeDefaultDO apple = new HashCodeDefaultDO();
		apple.setId(10);
		apple.setName("APPLE");
	    System.out.println(apple.getName() + " First hashcode = " + apple.hashCode());
		
	    HashCodeDefaultDO mango = new HashCodeDefaultDO();
	    mango.setId(10);
	    mango.setName("APPLE");
		System.out.println(mango.getName() + " Second hashcode = " + mango.hashCode());
		
		if(apple.equals(mango)){
			System.out.println(" ** They are equal. ***");
		}else{
			System.out.println(" They are not equal.");
		}
		
		System.out.println("\n === Default Hashcode = deep comparision ===");
		HashCodeAssignedDO hc11 = new HashCodeAssignedDO();
		hc11.setId(45);
		hc11.setName("TENNIS");
	    System.out.println(hc11.getName() + " First hashcode = " + hc11.hashCode());

		HashCodeAssignedDO hc22 = new HashCodeAssignedDO();
		hc22.setId(45);
		hc22.setName("TENNIS");
	    System.out.println(hc22.getName() + " Second hashcode = " + hc22.hashCode());

		if(hc11.equals(hc22)){
			System.out.println(" ** They are equal. ***");
		}else{
			System.out.println(" They are not equal.");
		}
	    
	}

}
