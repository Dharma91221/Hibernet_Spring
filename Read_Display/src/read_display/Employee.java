package read_display;

public class Employee {
	private int eid;
	private String eName;
	private int eSal;
	private String eDesig;
	
	private Department dept;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSal() {
		return eSal;
	}

	public void seteSal(int eSal) {
		this.eSal = eSal;
	}

	public String geteDesig() {
		return eDesig;
	}

	public void seteDesig(String eDesig) {
		this.eDesig = eDesig;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	
	
}
