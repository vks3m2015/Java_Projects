package concepts;
/*  
byte	1 byte	
short	2 bytes	
int	    4 bytes	   
long	8 bytes	
float	4 bytes	 
double	8 bytes	
char	2 byte	
 */

/* Widening or Automatic Type Conversion
 * ---------------------------------------
 * The two data types are COMPETIBLE.
   When we assign value of a smaller data type to a bigger data type.
   
   byte -> short -> int -> long -> float -> double 
 *   
 * 
 * Narrowing or Explicit Conversion
 * ---------------------------------
 * This is useful for incompatible data types where automatic conversion cannot be done.
 */
public class TypeConversion {

	public static void main(String[] args) {
		
		byte by = (byte) 128;
		System.out.println(by);   //-128
		
		int in = by;
		System.out.println(in);   //-128
		
		double dou = 1234;
		System.out.println(dou);
		
		long ln = 1234;
		System.out.println((int)Math.sqrt(ln));
		
		//System.out.println(Integer.parseInt("vikas"));    //java.lang.NumberFormatException
		
		char ch = 'c'; 
	    int num = 88888 * 8888888;
	    System.out.println("num = "+num);
	    ch = (char)num;   //char and number are not compatible with each other.
	                     //Type mismatch: cannot convert from int to char  (WE HAVE TO DO IT EXPLICITLY)
	    System.out.println(" ch == "+ ch);

	}

}
