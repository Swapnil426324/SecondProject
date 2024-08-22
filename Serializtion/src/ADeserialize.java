import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ADeserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fos=new FileInputStream("xyz.txt");
		ObjectInputStream ois=new ObjectInputStream(fos);
		A aa=(A)ois.readObject();
		System.out.println(aa.book);
		System.out.println(aa.authorise);
		System.out.println(aa.readtime);

	}

}
