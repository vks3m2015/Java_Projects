package concepts.string;

//Immutable - So its thread safe. It can be passed around, between methods and across threads, without
//worrying about whether the actual String object it's pointing to will change If any change a new object will be created.
//Immutable - Hashcode caching
//Immuatble - security (i.e - SQL Injection) 
//Immutable - performance (concatination is slow because creates new string but when creating same object its fast)


public class StringsObject {

	public static void main(String[] args) {
		
		String literal = "Vikas";
		String constructor = new String("Vikas");
		
		String intern = constructor.intern();
		
		System.out.println(" literal == constructor "+ ( literal == constructor));   //FALSE
		System.out.println(" literal == intern "+ ( literal == intern));    //TRUE
		System.out.println(literal.hashCode() == constructor.hashCode());  //TRUE
	}

}
