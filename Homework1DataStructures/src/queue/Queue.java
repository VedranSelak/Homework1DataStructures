package queue;

public class Queue<Item> {
	private Node<Item> head;
	private Node<Item> tail;
	private int size;
	
	//initializing the queue
	public Queue() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	//add to queue
	public void enqueue(Item data) {
		//make a new queue element
		Node<Item> newNode = new Node<Item>(data);
		//check if empty, if so tail and head are the newNode
		if(isEmpty()) {
			this.head = this.tail = newNode;
		}else {
			//else newNode is the tail
			this.tail.next = newNode;
			this.tail = newNode;
		}
		this.size++;
	}
	
	//get form queue
	public Item dequeue() {
		//if queue empty throw exception
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("Queue is empty!");
		}else {
			//else get the oldest, return it and move the head to the new oldest element
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
