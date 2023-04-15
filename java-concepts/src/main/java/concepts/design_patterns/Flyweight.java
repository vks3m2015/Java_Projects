package concepts.design_patterns;

import java.util.HashMap;
import java.util.Map;

//Need to improve
//https://refactoring.guru/design-patterns/flyweight/java/example
public class Flyweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class VehicleFactory{
	private static Map<String, Vehicle> cache = new HashMap<>();
	
	public static Vehicle createVehicle(String color) {
		
	    Vehicle newVehicle = cache.computeIfAbsent(color, newColor -> { 
	        return new Car(newColor, "other properties of car");
	    });
	    return newVehicle;
	}
}

class Car implements Vehicle{
	String color;
	String otherproprty;
	public Car(String color, String otherproprty) {
		super();
		this.color = color;
		this.otherproprty = otherproprty;
	}
	
}

interface Vehicle{
	
}


