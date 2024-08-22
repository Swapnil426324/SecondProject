package demo.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentDeserialization {

	public static void main(String[] args) {
		Student s1 = new Student(11, "ketan", "ME", 8.7f);
		Student s2 = new Student(26, "ajay", "ME", 8.3f);
		Student s3 = new Student(132, "pooja", "BE", 8.2f);
		Student s4 = new Student(119, "kriti", "BE", 7.3f);
		Student s5 = new Student(161, "ananya", "ME", 7.3f);
		List<Student> stulist = new ArrayList<Student>();
		stulist.add(s1);
		stulist.add(s2);
		stulist.add(s3);
		stulist.add(s4);
		stulist.add(s5);
		List<Student> studlist=new ArrayList<Student>();
		studlist.add(s1);studlist.add(s2);
		studlist.add(s3);studlist.add(s4);studlist.add(s5);
		
		try {
			FileInputStream fis=new FileInputStream("asus.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object obj=ois.readObject();
			List res=(ArrayList<Student>)obj;
			ois.close();
			fis.close();
			for(Object s:res)
				System.out.println((Student)s);
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("read successful");

	}

}
