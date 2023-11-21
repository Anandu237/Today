package com.obsqura.assignment;

class A{
	public A() {
		System.out.println("hi");
		
	}
public A(int a) {
	System.out.println("hello");
}
}
class B extends A{
	public B() {
	super(1);

		System.out.println(1);
	}
	public B(int a) {
	
	this();
		System.out.println(2);
	}
}
public class Chain{
	public static void main(String[] args) {
		B b = new B();
	}
}
