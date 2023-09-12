package concepts;

public class MultipleInheritance {

	public static void main(String[] args) {
		Pegasus myApp = new Pegasus();
        System.out.println(myApp.identifyMyself());   //I am a horse.

	}

}

class Pegasus2 implements Flyer, Mythical{

	//If not overriding then Compile time Error -
	//Duplicate default methods named identifyMyself with the parameters () and () are inherited from 
	//the types Mythical and Flyer
	@Override
	public String identifyMyself() {
		return Flyer.super.identifyMyself();
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


