package com.gupta.keertikeya;

public class FortinetMainClass {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		LinkedList reverse = new LinkedList();
		
		// Case 1: the list is null
		// Uncomment the next line to test this case
		// list.reverse(list.head);
		
		// Case 2: the list has only one Node with value 1 (value can be anything, but only one node)
		// Uncomment the next two lines to test this case
		// list.addNode(1);
		// list.reverse(list.head);
		
		// Case 3: the list has multiple nodes
		// Uncomment all lines with list.add() to test this case
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addNode(40);
		list.addNode(50);
		
		System.out.print("Original LinkedList: ");
		list.printList(list.head);
		
		reverse.head = list.reverseList(list.head);
		
		System.out.print("Reversed LinkedList: ");
		list.printList(reverse.head);
	}

}
