package weekfour;

//Class for Doubly Linked List 
public class DLL {

	// Class var
	Node head; // head of list
	int size;

	/* Doubly Linked list Node */
	class Node {
		int data;
		Node prev;
		Node next;

		// Constructor to create a new node

		// next and prev is by default initialized as null
		Node(int d) {
			data = d;
		}
	}

	void addAtPosition(int new_data, int position) {

		if (size == position - 1) {
			add(new_data);
		}

		else if (size < position) {
			System.out.println("Error");
		}

		else {
			int counter = 0;
			Node temp = head;

			while (counter < position) {
				temp = temp.next;
				counter++;
			}
			Node new_node = new Node(new_data);
			// Node temp2 = temp.next;
			new_node.next = temp.next;
			temp.next.prev = new_node;
			new_node.prev = temp;
			temp.next = new_node;
		}
		size++;
	}

	void addToSecond(int new_data) {
		if (head == null) {
			add(new_data);
		}
		if (head.next == null) {
			Node new_node = new Node(new_data);
			head.next = new_node;
			new_node.prev = head;
			new_node.next = null;
		}
		if (head.next != null) {
			Node new_node = new Node(new_data);
			Node temp = head.next;
			new_node.next = temp;
			head.next = new_node;
			new_node.prev = head;

		}
		size++;
	}

	// Add a node at the end of the list
	void add(int new_data) {
		/*
		 * 1. allocate node 2. put in the data
		 */
		Node new_node = new Node(new_data);

		Node last = head; /* used in step 5 */

		/*
		 * 3. This new node is going to be the last node, so make next of it as NULL
		 */
		new_node.prev = null;

		/*
		 * 4. If the Linked List is empty, then make the new node as head
		 */
		if (head == null) {
			new_node.prev = null;
			head = new_node;

		} else {
			new_node.next = head;
			head.prev = new_node;
			head = new_node;

		}
		size++;
		/* 5. Else traverse till the last node */
//		while (last.next != null) {
//		last = last.next;
//		}

		/* 6. Change the next of last node */
		// last.next = new_node;

		/* 7. Make last node as previous of new node */
		// new_node.prev = last;
	}

	// This function prints contents of linked list starting from the given node
	public void printlist(Node node) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();

//		System.out.println("Traversal in reverse direction");
//		while (last != null) {
//		System.out.print(last.data + " ");
//		last = last.prev;
//		}
	}

	/* Drier program to test above functions */
	public static void main(String[] args) {
		/* Start with the empty list */
		DLL dll = new DLL();

		// Insert 6. So linked list becomes 6->NULL
		dll.add(12);
		dll.add(12);
		// dll.addToSecond(12);
		dll.add(12);
		dll.add(12);
		dll.add(12);
		dll.addAtPosition(5, 4);

		System.out.println("Created DLL is: ");
		dll.printlist(dll.head);
	}
}
