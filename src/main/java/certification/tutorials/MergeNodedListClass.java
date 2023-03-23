package certification.tutorials;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeNodedListClass {

	// A Linked List Node
	public static class Node {

		int data;

		Node next;

		public Node(int data) {

			this.data = data;
			this.next = null;
		}

		public Node(int data, Node node) {

			this.data = data;
			this.next = node;
		}
	}

	/**
	 * Utility function to print contents of linked list
	 * 
	 * @param node
	 */
	public static void printNodeList(Node node) {

		while (node != null) {

			System.out.println(node.data + "->");
			node = node.next;
		}
	}

	/*
	 * the main function to merge given 'k' sorted linked lists. It takes array
	 * 'lists' of size 'k' and generates the sorted ouput
	 * 
	 */
	public static Node mergeNodeList(Node[] lists) {

		// create an ampty min-heap using a comparison object for ordering the
		// min-heap
		PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.data));

		// push the first Node of each list into the min-heap.
		pq.addAll(Arrays.asList(lists).subList(0, lists.length));

		// take two pointers, head and tail, where the head points to the first
		// Node
		// of the ouput list and tail point to its last node.

		Node head = null, tail = null;

		// run till min-heap is empty

		while (!pq.isEmpty()) {

			// extract the minimum Node from the mini-heap
			Node min = pq.poll();

			// add the minimum Node to the ouput list
			if (head == null) {
				head = tail = min;
			} else {

				tail.next = min;
				tail = min;
			}

		}
		return head;

	}

	public static void main(String[] args) {

		int k = 3; // total number of linked lists

		// an array to store the head nodes of the linked lists
		Node[] lists = new Node[k];

		lists[0] = new Node(1);
		lists[0].next = new Node(5);
		lists[0].next.next = new Node(7);

		lists[1] = new Node(2);
		lists[1].next = new Node(3);
		lists[1].next.next = new Node(6);
		lists[1].next.next.next = new Node(9);

		lists[2] = new Node(4);
		lists[2].next = new Node(8);
		lists[2].next.next = new Node(10);

		// Merge all lists into one
		Node head = mergeNodeList(lists);
		printNodeList(head);

	}

}
