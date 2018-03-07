package com.clean.builder.patterns;

public class FluentInterfacePattern {

	public static void main(String[] args) {

		FluentDO customer = FluentDO.create()
				.setFirstName("Andy")
				.setMiddleName("R")
				.setLastName("Murray")
				.setAge("35")
				.setOccupation("Tennis Pro");
		
		customer.printValues();
	}

}
