package com.santha.pattern.builder.fluent;

public class FluentInterfacePattern {

	public static void main(String[] args) {

		FluentDO customer = FluentDO.create()
				.setId(1005)
				.setFirstName("Andy")
				.setLastName("Murray")
				.setAge("35")
				.setOccupation("Tennis Pro");
		
		customer.printValues();
	}

}
