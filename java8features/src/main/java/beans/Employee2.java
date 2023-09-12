package beans;


public class Employee2 {
	int id;
	String name;
	double salary;
	String city;
	String state;

	Employee2(int id, String name, double salary, String city, String state) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
		this.state = state;
	}

	public String toString() {
		return "\n Employee[ id: " + id + ", name: " + name + ", salary: " + salary + ", city: " + city + ", state: "
				+ state + "]";
	}
}