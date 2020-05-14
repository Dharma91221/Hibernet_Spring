package many_many_xml_bi;

import java.util.ArrayList;

public class School {
	private String schId;
	private String schName;
	private ArrayList<Teacher> teacher;
	public String getSchId() {
		return schId;
	}
	public void setSchId(String schId) {
		this.schId = schId;
	}
	public String getSchName() {
		return schName;
	}
	public void setSchName(String schName) {
		this.schName = schName;
	}
	public ArrayList<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(ArrayList<Teacher> teacher) {
		this.teacher = teacher;
	}
	
	
}
