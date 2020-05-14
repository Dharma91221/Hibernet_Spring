package One_Many_Anote;

import javax.persistence.*;

@Entity
@Table(name="OM_Emp")
public class Employee {
	
	
	private int empid;
	private String ename;
	private String email;
	
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
	
	
}
