package com.gupta.keertikeya;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmptyLinkedList {

	@Test
	public void test() {
		LinkedList list = new LinkedList();
		assertNull(list.reverseList(list.head));
	}

}
