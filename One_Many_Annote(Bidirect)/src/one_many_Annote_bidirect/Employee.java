package one_many_Annote_bidirect;

import javax.persistence.*;

@Entity
@Table(name="om_emp_bi")
public class Employee {
	private int empid;
	private String ename;
	private String email;
	private Department department;
	
	@Id
	@Column(name="EMPID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	@Column(name="ENAME")
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@ManyToOne
	@JoinColumn(name="DEPID")
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
