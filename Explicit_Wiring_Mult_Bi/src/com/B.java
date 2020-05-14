package com;

public class B {
	private A a;

	
	public B() {
		System.out.println("inside default cons of B ");
	}
	public B(A a) {
		System.out.println("Parameter cons , inside B");
	}
	public A getA() {
		System.out.println("getA from B");
		return a;
	}

	public void setA(A a) {
		System.out.println("setA from B");
		this.a = a;
	}
	
	
}
