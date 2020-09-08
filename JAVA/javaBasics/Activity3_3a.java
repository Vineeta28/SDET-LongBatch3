package javaBasics;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       Queue<Integer> q = new LinkedList<Integer>();
		        for (int i=0;i<5;i++) {
		            q.add(i);
		        }

		        //Display contents of the queue. 
		        System.out.println("Elements in the queue: " + q);

		        //To remove the element in the queue.
		        int removeElem = q.remove();
		        
		        //To view the first number of the queue
		        System.out.println("head of queue: " + q.peek());
		        //Size of the queue
		        System.out.println("Size of queue: " + q.size());
		    }
		
	

}
