package generalFeatures;

import java.util.List;
import java.util.Optional;

public class OptionalUtil {

	public static void main(String[] args) {
		
		 String city = getCountryAfterJava8();
		 System.out.println(city);
		 
		 List l = List.of(1,2,3,4);
		 l.add(5);

	}
	
	static String getCountryAfterJava8() {
		Person p = getPerson(true);
		return Optional.ofNullable(p).map(person -> person.address).map(add -> add.city).orElse("NA");
	}
	
	static String getCountryBeforeJava8() {
		Person p = getPerson(true);
		if(p != null) {
			Address ad = p.address;
			if(ad != null)
				return ad.city;
		}
		return "NA";
	}
	
	
	
	static Person getPerson(boolean flag) {
		return flag ? new Person(123, new Address("Knp", "India")) : null;
	}

}




class Person{
	int id;
	Address address;
	public Person(int id, Address address) {
		super();
		this.id = id;
		this.address = address;
	}
}

class Address{
	String city;
	String country;
	public Address(String city, String country) {
		super();
		this.city = city;
		this.country = country;
	}
	
}
