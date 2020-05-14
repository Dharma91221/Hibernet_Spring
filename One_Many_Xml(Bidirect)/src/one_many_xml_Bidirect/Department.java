package one_many_xml_Bidirect;

import java.util.HashSet;
import java.util.Set;



public class Department {
	private int depid;
	private String dname;
	private Set<Employee> employees=new HashSet<Employee>(0);
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}
