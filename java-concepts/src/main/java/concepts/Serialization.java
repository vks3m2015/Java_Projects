package concepts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

import concepts.models.Address;


/*The class of the object, the signature of the class, and the values of the non-transient
* and non-static fields of the class and all of its supertypes are written*/
public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Person person = new Person(123, "vks", "vikku", new Address("Knp", "India"));
		
		FileOutputStream fos = new FileOutputStream("Files/SerializationObject");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	    //This method takes a serializable object and converts it into a sequence (stream) of bytes.
		oos.writeObject(person);
		oos.close();
		
		
		FileInputStream fis = new FileInputStream("Files/SerializationObject");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//This method can read a stream of bytes and convert it back into a Java object. It can then be cast back to the original object
		Person p = (Person)ois.readObject();
		ois.close();
		
		System.out.println(" Person = "+p);
		/*
		 * System.out.println("id  = "+ p.id); System.out.println("nick Nmae  = "+
		 * p.nickName); System.out.println("Organisation Name  = "+ p.organisation);
		 * System.out.println("Address   = "+ p.address);
		 */
		
		

	}

}


//static fields belong to a class (as opposed to an object) and are not serialized
//we can use the keyword transient to ignore class fields during serialization
class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public int id;
	public String name;
	public transient String nickName;
	static String organisation = "XYZ";
	//Address class must implement the Serializable interface else a NotSerializableException will be thrown. 
	//Need to make it transient as its not serializable. Still we can store its info using custom way of serialization
	public transient Address address; 
	
	public Person(int id, String name, String nickName, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.nickName = nickName;
		this.address = address;
	}

	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();
		oos.writeObject(address.city);
		oos.writeObject(address.country);
	}

	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		String city = (String) ois.readObject();
		String country = (String) ois.readObject();
		Address a = new Address(city, country);
		this.address = a;
	}
	
	private Object readResolve() throws ObjectStreamException{
		//System.out.println(".. readResolve ...");
		return this;
	}
	
	private Object writeReplace() throws ObjectStreamException{
		return this;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", nickName=" + nickName + ", organistion="+ organisation +", address=" + address + "]";
	}
	
	
	
	
}

/*
 * class Address{
 * 
 * String city; String country;
 * 
 * public Address(String city, String country) { this.city = city; this.country
 * = country; }
 * 
 * @Override public String toString() { return "Address [city=" + city +
 * ", country=" + country + "]"; } }
 */
