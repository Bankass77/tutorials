package certification.tutorials.collection;

import lombok.Data;

@Data
public class Node {

	// Properties
	int  data;
	Node next;
	
	// Constructors
	public Node(int data) {
		
		this.data=data;
		next= null;
	}

	public Node(int newData, Node newNext) {
		
		this.data= newData;
		next= newNext;
		
	}
}
