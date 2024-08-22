package com.serialization_ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s1 = new Student(11, "nitin", "ME", 8.9f);
		Student s2 = new Student(45, "ajay", "ME", 8.4f);
		Student s3 = new Student(911, "pooja", "BE", 7.9f);
		Student s4 = new Student(113, "aditi", "BE", 5.4f);
		Student s5 = new Student(112, "kriti", "BE", 8.7f);
		Student s6 = new Student(451, "ananya", "ME", 8.9f);
		List studentlist = new ArrayList<Student>();
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		studentlist.add(s5);
		studentlist.add(s6);

		FileOutputStream fos = new FileOutputStream("target.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos); // wrapping
		oos.writeObject(studentlist);
		oos.close();
		fos.close();
		System.out.println("serializtion Writing done");
		
		//Deseririalization	
		FileInputStream fis = new FileInputStream("target.txt");
		ObjectInputStream ois = new ObjectInputStream(fis); // wrapping
		Object obj=ois.readObject();
		List res=(ArrayList<Student>) obj;
		System.out.println(res);
		System.out.println("serializtion reading done");
		
		


	}

}
