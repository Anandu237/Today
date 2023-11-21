package com.obsqura.assignment;

public class Car {
	String color;
	String carName;
	int regno;
	public Car(String color, String carName, int regno) {
		super();
		this.color = color;
		this.carName = carName;
		this.regno = regno;
	}
void display() {
	System.out.println(color+";"+carName+";"+regno);
}
}
