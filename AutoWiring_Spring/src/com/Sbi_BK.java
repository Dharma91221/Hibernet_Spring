package com;

public class Sbi_BK {
	private Cust cust;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sbi_BK() {
		System.out.println("inside sbi constr");
	}
	
	public Sbi_BK(Cust cust) {
		System.out.println("inside sbi parameetr");
		
	}
	public Cust getCust() {
		return cust;
	}

	public void setCust(Cust cust) {
		System.out.println("inside sbi,setCust");
		this.cust = cust;
	}
	

}
