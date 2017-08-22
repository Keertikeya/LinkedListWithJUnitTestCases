package com.gupta.keertikeya;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMultipleNodesLinkedList {
	/*
	 * This test case will for all cases
	 *  		1. when list is null
	 *  		2. when there is only one Node in the list
	 *  		3. and when list has multiple Nodes
	 * 
	 * */
	
	
	@Test
	public void test() {
		int values[] = {1, 2, 3, 4, 5};
		int reverseIndex = values.length - 1;
		
		LinkedList list = new LinkedList();
		LinkedList reverse = new LinkedList();
		
		
		// Add values 1 to 5 in list
		for (int i = 0; i < values.length; i++) {
			list.addNode(values[i]);
		}
		
		
		// Reverse the list
		reverse.head = list.reverseList(list.head);
		Node node = reverse.head;
		
		
		// Check if reversed list matches expected result
		while (node != null) {
			// Traversing the array values reverse
			// and reversedList in proper direction
			// values should match
			assertEquals(values[reverseIndex], node.value);
			
			// the next element of last node in reverseList should be null
			if (reverseIndex == 0) {
				assertNull(node.next);
			}
			
			node = node.next;
			reverseIndex--;
		}
	}

}
