package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("five");
		hs.add("six");
		System.out.println("Size of the HashSet is "+hs.size());
		hs.remove("three");
		hs.remove("seven");
		System.out.println("Checking if four is present " + hs.contains("four"));
		System.out.println("Printing the updated set below :");
		for(String s:hs) {
			System.out.println(s);
		}
		}
		
	}


