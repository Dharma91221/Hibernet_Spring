package explicit_wiring;

public class A {
	private B b;
	
	public A() {
		System.out.println("inside default const of A");
	}
	
	public A(B b) {   //not called untill we cal
		System.out.println("inside parameterised con of A");
		this.b=b;
	}
	
	public B getB() {
		return b;
	}
	
	public void setB(B b) {
	
		this.b=b;
	}
}
