package hbm_util;
import java.util.Date;

public class Employee {
	
	private Date doj;
	private Date login;
	private int empid;
	private String name;
	private int salary;
	
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Date getLogin() {
		return login;
	}
	public void setLogin(Date login) {
		this.login = login;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
