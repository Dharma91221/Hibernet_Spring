package spring_constr;

public class Employee {
	private int empid;
	private String ename;
	private String sal;
	public Employee(int empid, String ename, String sal) {
		super();
		
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEname() {
		return ename;
	}
	public String getSal() {
		return sal;
	}
	
	
}
