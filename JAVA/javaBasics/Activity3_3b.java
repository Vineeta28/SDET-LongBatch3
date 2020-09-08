package javaBasics;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<String> dq = new LinkedList<String>();
		dq.add("Dog");
		dq.add("Cat");
		dq.add("Mouse");
		dq.add("Lion");
		dq.add("Tiger");
		dq.add("Horse");
		System.out.println("original size of the queue is "+dq.size());
        Iterator<String> iterator = dq.iterator();
    	while (iterator.hasNext()) {
	        System.out.println(iterator.next());
	       }
    	
    	System.out.println("Peek at the head of the element "+ dq.peekFirst());
    	System.out.println("Tail element of the queue "+ dq.peekLast());
    	System.out.println("Wolf present in the queue? "+dq.contains("Wolf"));
    	System.out.println("Removing the first element from the queue "+ dq.removeFirst());
    	System.out.println("Removing the last element from the queue "+ dq.removeLast());
    	System.out.println("size of the queue after the removal is "+dq.size());
	}

}
