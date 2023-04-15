package concepts;

public class TypeConversion2 {

	public static void main(String[] args) {
		
		char ch = 'a';
		int i = 10;
		long l = 16443356;
		float f = 12.2f;
		double d = 1222.4;
		boolean b = true;
		
		String str = "vikas";
		StringBuilder sb = new StringBuilder("vikas");
		StringBuffer sbu = new StringBuffer("singh");
		
		//char to String
		str = String.valueOf('c');
		String str2 = Character.toString('c');
		String str3 =  "" + 'c' ;    //But this compiles down to - String s = new StringBuilder().append("").append('s').toString(); 	which is less efficient
	
		//to string
		String s = String.valueOf(b);   //b can be  char, char[], int, long, float, double
	    System.out.println(" s == "+ s);
	    
	    String.valueOf(1);
	    //Integer i = Integer.valueOf(s); 
	    //int j = Integer.parseInt(s);
	    
	    //NumberFormatException
	    System.out.println(" from string to int =="+Integer.valueOf("abc"));
	    
	    
	    
	    str = Integer.toString(i);
	    str = Long.toString(l);
	    str = Float.toString(f);
	    str = Double.toString(d);
	    str = Character.toString(ch);
	    
	    str = sb.toString();
	    str = sbu.toString();
	    
	    
	   
	}

}
