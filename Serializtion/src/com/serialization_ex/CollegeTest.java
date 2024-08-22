package com.serialization_ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CollegeTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		College obj1=new College(12, "Harsh", 8.3f, "BE");
		College obj2=new College(13, "Suraj", 6.8f, "BE");
		College obj3=new College(14, "Saniya", 9.3f, "BE");
		College obj4=new College(15, "Rakesh", 4.3f, "BE");
		
		ArrayList<College> al=new ArrayList<College>();
		al.add(obj1);al.add(obj2);
		al.add(obj3);al.add(obj4);
		
		FileOutputStream fos = new FileOutputStream("isro.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(al);
		oos.close();
		System.out.println("write done");
		
		//Deseririalization	
		FileInputStream fis = new FileInputStream("isro.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object oo=ois.readObject();
		ArrayList<College> list = (ArrayList<College>)oo;
		System.out.println(list);
		System.out.println("reading done");

	}

}
