package concepts;

public class MultipleInheritance {

	public static void main(String[] args) {
		Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());   //I am a horse.

	}

}

//Instance methods are preferred over interface default methods
class Pegasus extends Horse implements Flyer, Mythical {
}

class Horse {
    public String identifyMyself() {
        return "I am a horse.";
    }
}

interface Flyer {
    default public String identifyMyself() {
        return "I am able to fly.";
    }
}
interface Mythical {
    default public String identifyMyself() {
        return "I am a mythical creature.";
    }
}


