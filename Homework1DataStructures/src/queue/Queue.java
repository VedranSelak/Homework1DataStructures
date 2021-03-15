package queue;

public class Queue<Item> {
	private Node<Item> head;
	private Node<Item> tail;
	private int size;
	
	public Queue() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	public void enqueue(Item data) {
		Node<Item> newNode = new Node<Item>(data);
		if(isEmpty()) {
			this.head = this.tail = newNode;
		}else {
			this.tail.next = newNode;
			this.tail = newNode;
		}
		this.size++;
	}
	
	public Item dequeue() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Queue is empty!");
		}else {
			Item ret = this.head.data;
			this.head = this.head.next;
			this.size--;
			return ret;
		}
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return (this.size == 0);
	}
}
