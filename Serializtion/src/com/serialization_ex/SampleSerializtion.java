package com.serialization_ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SampleSerializtion {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Sample s1=new Sample();
		s1.id=234;
		s1.name="arun";
		s1.cgpa=7.8f;
		s1.location="pune";
		
		FileOutputStream fos = new FileOutputStream("git.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		System.out.println("done writing");
		
		FileInputStream fis = new FileInputStream("git.txt");
		ObjectInputStream ois = new ObjectInputStream(fis); 
		Object obj=ois.readObject();
		Sample sample = (Sample)obj;
		System.out.println(sample.id);
		System.out.println(sample.name);
		System.out.println(sample.cgpa);
		System.out.println(sample.location);
		System.out.println("reading done by using deserializtion........");
		
		

	}

}
