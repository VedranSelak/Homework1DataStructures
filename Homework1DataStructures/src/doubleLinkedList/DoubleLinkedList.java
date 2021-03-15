package doubleLinkedList;

public class DoubleLinkedList<Item> {
	
	private Node head;
	private int size;
	
	public DoubleLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public void addToFront(Item data) {
		Node<Item> newNode = new Node(data);
		
		if(this.head == null) {
			this.head = newNode;
		}else {
			newNode.next = this.head;
			this.head.prev = newNode;
			this.head = newNode;
		}
		this.size++;
	}
	
	public void addToRear(Item data){
		Node<Item> newNode = new Node(data);
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			Node<Item> current = this.head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
		this.size++;
	}
	
	public void print() {
		Node current = this.head;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
