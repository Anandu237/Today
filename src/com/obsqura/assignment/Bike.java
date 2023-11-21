package com.obsqura.assignment;

public class Bike {
	String bikeName;
	int regno;
	public Bike(String bikeName, int regno) {
		super();
		this.bikeName = bikeName;
		this.regno = regno;
	}
void display() {
	System.out.println(bikeName+";"+regno);
}
}
