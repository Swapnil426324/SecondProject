import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class StusentDeserialization {

	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("abcd.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			Student s1=(Student)o;
			System.out.println(s1.name);
			System.out.println(s1.age);
			System.out.println(s1.location);
			ois.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
