package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableObj {

	public static void main(String[] args) {
		
		List<String> items = new ArrayList<>();
		items.add("tshirt");
		items.add("lower");
		Bill bill = new Bill(1000,items );
		System.out.println(bill);
		
		//Since private so we cann't access directly
		//bill.items.add("jeans");
		//System.out.println(bill);
		
		items.add("jeans");
		System.out.println(bill);
		
		bill.getItems().add("jeans");
		System.out.println(bill);

	}

}


final class Bill{
	private final int amount;
	
	//fields also needs to be private. So that it cann't be accessed outside class and then can be changed
	private final List<String> items;
	
	public Bill(int amount, List<String> items) {
		super();
		this.amount = amount;
		//Wrong
		//this.items = Collections.unmodifiableList(items);
		
		this.items = items.stream().collect(Collectors.toList());
	}
	
	public int getAmount() {
		return amount;
	}

	//Don't return reference of mutable objects 
	public List<String> getItems() {
		return items.stream().collect(Collectors.toList());
	}
	
	@Override
	public String toString() {
		return "Bill [amount=" + amount + ", items=" + items + "]";
	}
	
}
