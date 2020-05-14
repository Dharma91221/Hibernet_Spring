package many_one_annote;
import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
	
	private int sid;
	private String sname;
	private Address address;
	
	
	@Id
	@Column(name="SID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	@Column(name="SNAME")
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@ManyToOne(cascade= {CascadeType.ALL}) 
	@JoinColumn(name="AID")
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
