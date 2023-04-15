package practice;

class Test2 {
	
	public static void main(String[] arg)
	{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(3);
		ll.add(5);
		ll.add(8);
        ll.add(10);
        ll.add(12);
        ll.add(14);
       // ll.add(16);
        
        ll.traverse();
        
        ll.midElement();
	}

}

class LinkedList<E>
{
   Node<E> head;
   
   LinkedList()
   {
	  
   }
   LinkedList(Node<E> head)
   {
	   this.head = head;
   }
   
   class Node<E>
   {
	   E data;
	   Node<E> next;
	   
	   Node(E data)
	   {
		   this.data = data;
		   
	   }
   }
   
   public void add( E element)
   {
	 Node<E> node = new Node(element);
	 Node<E> ptr = head;
	 
	 if(ptr == null)
	 {
		 head = node;
		 return;
	 }	 
	    
	 
	 while(ptr.next != null)
	   ptr = ptr.next;
	 
	 ptr.next = node;
	 
   }
   
   public void traverse()
   {
	   Node<E> temp = head;
	   
	   while(temp != null)
	   {	   
		   System.out.println(" -> "+ temp.data);
		   temp = temp.next;
	   }
   }
   
   public void midElement()
   {
	   Node<E> fast = head; Node<E> slow = head;
	   
	   while(fast.next != null && fast.next.next != null)
	   {
		   fast = fast.next.next;
		   //System.out.println(" ----"+fast.data);
		   slow = slow.next;
		   
	   }	   
	   
	   if(fast.next == null)
		   System.out.println(slow.data);
	   else
		   System.out.println(slow.data +"  "+slow.next.data);
	   
   }
}
