package bidirection;

import java.util.HashSet;
import java.util.Set;

public class Address {
	
	private int aid;
	private String city;
	private String zipcode;
	private Set<Student> stu=new HashSet<Student>(0);
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public Set<Student> getStu() {
		return stu;
	}
	public void setStu(Set<Student> stu) {
		this.stu = stu;
	}
	
	
}
