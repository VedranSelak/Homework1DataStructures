package doublyLinkedList;

import java.util.Iterator;

public class DoublyLinkedList<Item> implements Iterable<Item>{
	
	private Node<Item> head;
	private Node<Item> tail;
	private int size;
	
	//constructor initializing the list
	public DoublyLinkedList() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	//adding to front method
	public void addToFront(Item data) {
		//making the new node
		Node<Item> newNode = new Node(data);
		//checking if empty, if so head and tail both point to the new node
		if(this.head == null) {
			this.head = this.tail = newNode;
		}else {
			//putting the new node as the head node
			newNode.next = this.head;
			//no need to type newNode.prev = null because its already initialized in the Node constructor
			this.head.prev = newNode;
			this.head = newNode;
		}
		this.size++;
	}
	
	//adding to rear method
	public void addToRear(Item data){
		//making the new node
		Node<Item> newNode = new Node(data);
		//checking if empty, if so head and tail both point to the new node
		if(this.head == null) {
			this.head = this.tail = newNode;
		}
		else {
			//putting the new node as the tail node
			this.tail.next = newNode;
			//no need to type newNode.next = null because its already initialized in the Node constructor
			newNode.prev = this.tail;
			this.tail = newNode;
		}
		this.size++;
	}
	
	//removing from the front method
	public void removeFromFront() {
		//throwing an exception if tried to remove from an empty list
		if(this.head == null) {
			throw new IndexOutOfBoundsException("The list is empty!");
		}else if(this.head == this.tail) {
			//if head == tail, then we have one elements, set it to null
			this.head = this.tail = null;
		}else {
			//moving the head to the next element
			this.head = this.head.next; 
			this.head.prev = null;
		}
		this.size--;
	}
	
	//removing from the rear method
	public void removeFromRear() {
		//throwing an exception if tried to remove from an empty list
		if(this.head == null) {
			throw new IndexOutOfBoundsException("The list is empty!");
		}else if(this.head == this.tail) {
			//if head == tail, then we have one elements, set it to null
			this.head = this.tail = null;
		}else {
			//moving the tail to the previous element
			this.tail = this.tail.prev;
			this.tail.next = null;
		}
		this.size--;
	}
	
	public int count() {
		return this.size;
	}
	
	public Iterator<Item> iterator() {
	    return new DoublyLinkedListIterator();
	}
	 
	private class DoublyLinkedListIterator implements Iterator<Item> {        
		Node<Item> current = head;                                      
	        
	    public boolean hasNext() {                                      
	    	return current != null;                                     
	    }                                                               
	        
	    public Item next() {                                            
	    	Item item = current.data;                                   
	        current = current.next;                                     
	        return item;                                                
	    }
	}
	    
}
