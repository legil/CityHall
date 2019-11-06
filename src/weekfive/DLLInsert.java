package weekfive;

public class DLLInsert {
	Node head;
	Node tail;
	int size = 0;

	static class Node {
// data
		int data;
// next node in the list
		Node next;
// previous node in the list
		Node prev;

		Node(int data) {
			this.data = data;
		}

		public void displayData() {
			System.out.print(" " + data);
		}
	}

// constructor for list
	public DLLInsert() {
		this.head = null;
		this.tail = null;
	}

// method to check if the list is empty
	public boolean isEmpty() {
		return head == null;

	}

	public void insertFirst(int data) {
// Create a new node
		Node newNode = new Node(data);
// if first insertion, tail should also point to this node
		if (isEmpty()) {
			tail = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head; // head before insertion
		}
		head = newNode; // head after insertion
		size++;
	}

	public void insertLast(int data) {
// Create a new node
		Node newNode = new Node(data);
// if first insertion, tail should also point to this node
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail; // previous tail // 15, 20, 25
		}

		tail = newNode;
		size++;
	}

	private boolean isValidPosition(int position) {
		return position >= 1 && position <= size + 1;
	}

	public void insertAtPosition(int data, int position) {

// Check if it a valid position to add, else return
		if (!isValidPosition(position)) {
			System.out.println("Not a valid position");
			return;
		}

// insert at the start
		if (position == 1) {
			insertFirst(data);
		}
//insert at last
		else if (size == position - 1) {
			insertLast(data);
		}
//insert in any other valid position
		else {
//Find the node before which you want to add new node   5, 8, 10
//and set it to current

			// Create a node object
			Node newNode = new Node(data);

			// Set current to head
			Node current = head;

			for (int i = 1; i < position - 1; i++) {
				current = current.next;
			}

			newNode.next = current.next;
			current.next.prev = newNode;
			current.next = newNode;
			newNode.prev = current;
			size++;
			
			
			/*
			newNode.next = current.next;
			newNode.prev = current;
			current.next = newNode;
			*/
		}
	}

	// delete first
	public void deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is already empty");
			return;
		} else {
			if(head == null) {
				head = null;
				tail = null;
			}
		}
		head = head.next;
		head.prev = null;

		size--;
	}
	
	public boolean isValidDeletePosition(int position) {
		return position >= 1 && position <= size;
	}

	public void deleteLast() {
		if(!isEmpty()) { //or head != null
			
			Node current = head;
			
			if(tail == head) {
				tail = null;
				head = null;
				size--;
				return;
			}
	
			int i = 0;
			while (i < size - 1) {
				current = current.next;
				i++;
			}
	
			// System.out.println(current.data);
			
			tail = current.prev;
			tail.next = null;
			size--;
			
			} else { //if empty
		System.out.println("List is empty!");
			}
	}


	public void deleteAtPosition(int position) {
		Node current = head;
		
		if (!isValidDeletePosition(position)) {
			System.out.println("Not a valid position");
			return;
		}

	//delete at the start
		if(position==1)
		{
			deleteFirst();
		}
		
	//delete at last
		else if(size == position)
		{
			deleteLast();
		}
		
	//delete in any other valid position
		else
		{
			for(int i = 1; i < position; i++) {
				current = current.next;
			}
			
			current.prev.next= current.next;
			current.next.prev = current.prev;	
		}
	}

// Method for forward traversal
	public void displayForward() {
		Node current = head;
		while (current != null) {
			current.displayData();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		Node current = tail;
		while(current != null) {
			current.displayData();
			current = current.prev;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DLLInsert list = new DLLInsert();
		list.insertFirst(1);
		list.insertFirst(2);
		
		list.insertAtPosition(5, 3);
		
		list.insertLast(98);
		list.insertLast(99);
		
		
	   list.insertAtPosition(10, 2);
	   list.displayForward();
	   list.displayBackward();
	   
	   //list.deleteAtPosition(3);
		
		//list.deleteFirst();
		//list.deleteLast();
		
		
		
		
//	System.out.println("Linked list forward traversal");
//	list.displayForward();
//	Node node = list.deleteAtIndex(2);
//	System.out.println("Node with value " + node.data + " deleted");
//	list.displayForward();
	}
}