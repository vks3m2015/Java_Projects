package generics;

import java.util.ArrayList;
import java.util.List;

public class MyNumberList<T extends Number> {

	private List<T> list;

	public MyNumberList() {
		this.list = new ArrayList<>();
	}
	
	public boolean add(T element) {
		return list.add(element);
	}
	
	
}
