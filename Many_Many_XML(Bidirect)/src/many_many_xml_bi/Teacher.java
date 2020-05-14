package many_many_xml_bi;

import java.util.ArrayList;

public class Teacher {
	private int tId;
	private String Tsub;
	private ArrayList<School> sch;
	
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getTsub() {
		return Tsub;
	}
	public void setTsub(String tsub) {
		Tsub = tsub;
	}
	public ArrayList<School> getSch() {
		return sch;
	}
	public void setSch(ArrayList<School> sch) {
		this.sch = sch;
	}
	
	
	
}
