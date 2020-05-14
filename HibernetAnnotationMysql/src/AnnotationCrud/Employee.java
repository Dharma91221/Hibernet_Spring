package AnnotationCrud;

import javax.persistence.*;



@Entity
@Table(name="emp1")
public class Employee {
	private int id;
	private String name;
	private int sal;
	
	@Id
	@Column(name="emp_id")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="salary")
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
}
