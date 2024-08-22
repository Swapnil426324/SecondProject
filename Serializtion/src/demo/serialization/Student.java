package demo.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	private transient int id;
	private String name;
	private String coure;
	private float cgpa;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String coure, float cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.coure = coure;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", coure=" + coure + ", cgpa=" + cgpa + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoure() {
		return coure;
	}
	public void setCoure(String coure) {
		this.coure = coure;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}


}
