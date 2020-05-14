package one_many_Annote_bidirect;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="om_dept_bi")
public class Department {
	private int depid;
	private String dname;
	private Set<Employee> employees=new HashSet<Employee>(0);
	
	@Id
	@Column(name="DEPID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	
	@Column(name="DNAME")
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}
