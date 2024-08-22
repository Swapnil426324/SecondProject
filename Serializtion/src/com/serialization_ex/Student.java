package com.serialization_ex;

import java.io.Serializable;
public class Student implements Serializable, Comparable<Student>{
	private int id;
	private String name;
	private String course;
	private float cgpa;
	@Override
	public int compareTo(Student o) {
		return new Integer(this.id).compareTo(o.id);
	}
	public Student(int id, String name, String course, float cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", cgpa=" + cgpa + "]";
	}
	
}
