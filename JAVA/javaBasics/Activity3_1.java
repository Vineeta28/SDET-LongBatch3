package javaBasics;

import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Ross");
		myList.add("Monica");
		myList.add("Joey");
		myList.add("Phoebee");
		myList.add("Janice");
		for(String name:myList) {
			System.out.println(name);
		}
		System.out.println("3rd name in the ArrayList " + myList.get(2));
		System.out.println("Is Joey present in the list " + myList.contains("Joey"));
		System.out.println("Number of names in the ArrayList "+myList.size());
		myList.remove("Janice");
		System.out.println("New size of ArrayList "+myList.size());
	}

}
