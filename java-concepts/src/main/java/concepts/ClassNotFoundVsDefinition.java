package concepts;

/* NoClassDefFoundError
 * The required class definition was present at compile time, but it was missing at runtime
 * If you remove the ABC.class file and run the ClassNotFoundVsDefinition.class file, Java Runtime System will throw NoClassDefFoundError 
 * 
 */
class ABC 
{
	
}
public class ClassNotFoundVsDefinition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABC a = new ABC();
		System.out.println("a = "+a);

	}

}
