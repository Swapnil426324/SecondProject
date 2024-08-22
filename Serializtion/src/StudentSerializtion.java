import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerializtion {

	public static void main(String[] args) {
		Student s=new Student();
		s.name="rohit";
		s.age=25;
		s.location="pune";

		try {
			FileOutputStream fos = new FileOutputStream("abcd.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			System.out.println("Serializtion is done......");
			oos.close();
		}  catch (IOException e) {
			e.printStackTrace();
		}
		


	}

}
