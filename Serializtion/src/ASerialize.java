
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ASerialize {

	public static void main(String[] args) throws IOException {
		A a=new A();
		a.book="RoyalFarmers";
		a.authorise="xyz";
		a.readtime=12;
		
		FileOutputStream fos=new FileOutputStream("xyz.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		oos.close();
		oos.flush();
		System.out.println("Serialize Written Done");

	}

}
