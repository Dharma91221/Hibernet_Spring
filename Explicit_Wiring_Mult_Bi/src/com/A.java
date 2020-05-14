package com;

public class A {
	private B b;
	
	public A() {
		System.out.println("inside default const of A");
	}
	public A(B b) {
		System.out.println("Parameter con, inside A");
	}

	public B getB() {
		System.out.println("getB from A");
		return b;
	}

	public void setB(B b) {
		System.out.println("setB from A");
		this.b = b;
	}
	
}
