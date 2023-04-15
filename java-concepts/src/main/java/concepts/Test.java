package concepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
		
		Test t = new Test();
		//Object ob = t.clone();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Gyan\\serializationPurpose.txt"));
		oos.writeObject(t);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\Gyan\\serializationPurpose.txt"));
		Test singletonObj4 = (Test)ois.readObject();

	}

}
