package com.gupta.keertikeya;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSingleNodeLinkedList {

	@Test
	public void test() {
		// Single element in the list: 1
		
		// Declare two lists
		LinkedList list = new LinkedList();
		
		list.addNode(1);
		list.reverseList(list.head);
		
		assertEquals(1, list.head.value);
		assertNull(list.head.next);
		
	}

}
