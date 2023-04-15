package concepts;

import java.util.ArrayList;

public class Generics<T> {
	
	public String meth(T t)
	{
		return "vik";
	}

}


class Bag<T,U>
{
    ArrayList<T> coins = new ArrayList<T>();
    ArrayList<U> notes = new ArrayList<U>();
    
    public void addIntoBag(Object coin)
    {
    	//if(coin instanceof T)
    	//coins.add(coin);
    }
	
  

}