package com.serialization_ex;

import java.io.Serializable;

public class College implements Serializable{
int id ;
String name;
float cgpa;
String cours;
public College(int id, String name, float cgpa, String cours) {
	super();
	this.id = id;
	this.name = name;
	this.cgpa = cgpa;
	this.cours = cours;
}
@Override
public String toString() {
	return "College [id=" + id + 
			", name=" + name +
			", cgpa=" + cgpa + 
			", cours=" + cours + "]";
}

}
