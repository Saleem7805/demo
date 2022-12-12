package com.DSA;

import java.util.LinkedList;

public class LearnLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> ll = new LinkedList<String>();
		 
	        // Adding elements to the linked list
	        ll.add("A");
	        ll.add("B");
	        ll.addLast("C");
	        ll.addFirst("D");
	        ll.add(2, "E");
	 
	        System.out.println(ll);
	 
	        ll.remove("B");
	        ll.remove(3);
	        ll.removeFirst();
	        ll.removeLast();
	 
	        System.out.println(ll);
	        LinkedList<String> l2 = new LinkedList<String>();
	        l2.add("Geeks");
	        l2.add("Geeks");
	        l2.add(1,"For");
	        System.out.println(l2);
	        l2.remove(1);
	        System.out.println(l2);
	        l2.remove("Geeks");
	        System.out.println(l2);

	}

}
