package com.gupta.keertikeya;

public class LinkedList {
	
	 
    Node head;
     Node tail;
 
    // Add nodes to the linked list
    void addNode(int value) {
    	if (head==null) {
    		head = new Node();
    		tail = new Node();
    		
    		head.value = value;
    		head.next = null;
    		
    		tail = head;
    	} else {
    		tail.next = new Node();
    		tail = tail.next;
    		tail.value = value;
    		tail.next = null;
    	}
    }// end of addNode
 
    
    // Reverse the linked list
    public Node reverseList(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
    }// end of reverseList
 
    // Print the linked list
    public void printList(Node head) {
    	Node node = head;
    	
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        
        if (node == null)
        	System.out.println("null");
    }// end of printList
}
