package demo.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentSerialization {

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
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("asus.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(studlist);
			oos.close();
			fos.close();
		}  catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("writing done");

	}

}
