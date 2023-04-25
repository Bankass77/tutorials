package certification.tutorials.collection;

import java.util.LinkedList;

import lombok.Data;

@Data
public class LinkedListNodeTest {

	// Initially the head and tail of the linked list set to null
	public Node head = null;
	public Node tail = null;
	int data;

	public LinkedListNodeTest() {

		head = null;
		data = 0;
	}

	public LinkedListNodeTest(Node newHead) {

		head = newHead;
		data = 0;
	}

//	Methods

	public void add(int newData) {

		// create new Node to the linkedList

		Node temp = new Node(newData);

		if (head == null) {

			head = temp;
			tail = temp;
		} else {

			// add tmp after tail
			tail.next = temp;
			// tmp is now the tail or last element
			tail = temp;
		}
	}

	// get
	public int getIndex(int index) {

		if (index <= 0) {

			return -1;
		}
		Node current = head;

		for (int i = 1; i < index; i++) {
			current = current.getNext();

		}
		return index;
	}

	public boolean isEmpty() {

		return head == null;
	}

	public void remove(Node head) {

		if (head == null) { // if the linked list is empty, there is nothing to remove

			return;
		}

		Node prevNode = null;
		Node currentNode = head;

		while (currentNode.getNext() != null) {// traverse the linked list to find the last node

			prevNode = currentNode;
			currentNode = currentNode.next;
		}

		if (prevNode == null) { // if there was only one node in the linked list, set the head to null
			head = null;

		} else {// remove the last node by setting the next pointer of the second-to-last node
				// to null

			prevNode.next = null;
		}
	}
	
	public static Node removeNode(Node head, int value) {
	    Node prevNode = null;
	    Node currNode = head;
	    
	    while (currNode != null && currNode.data != value) {
	        prevNode = currNode;
	        currNode = currNode.next;
	    }
	    
	    if (currNode == null) { // value not found in the list
	        return head;
	    } else if (prevNode == null) { // removing the head node
	        head = head.next;
	    } else { // removing a non-head node
	        prevNode.next = currNode.next;
	    }
	    
	    return head;
	}


	public static Node insert(Node head, int data) {
		Node newNode = new Node(data); // create a new node with the given data value

		if (head == null) { // if the linked list is empty, the new node becomes the head
			head = newNode;
		} else {
			Node currNode = head;
			while (currNode.next != null) { // traverse the linked list to find the last node
				currNode = currNode.next;
			}
			currNode.next = newNode; // add the new node to the end of the linked list
		}

		return head; // return the updated head of the linked list
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String[] args) {
		LinkedList<String> myLinkedList = new LinkedList<>();
// Add a node with data="First" to back of the (empty) list
		myLinkedList.add("First");

		// Add a node with data="Second" to back of the (empty) list
		myLinkedList.add("Second");

		// Add a node with data="Three" to back of the (empty) list
		myLinkedList.add("Three");

		// Add a node with data="Four" to back of the (empty) list
		myLinkedList.add("Four");

		// Add a node with data="Georges" to back of the (empty) list
		myLinkedList.addFirst("Georges");
		// Add a node with data="François" to back of the (empty) list
		myLinkedList.addLast("François");

		for (String string : myLinkedList) {
			System.out.println(string);
		}

	}

}
