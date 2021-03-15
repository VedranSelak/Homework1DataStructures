package doubleLinkedList;

import java.util.Iterator;

public class DoubleLinkedList<Item> implements Iterable<Item>{
	
	private Node<Item> head;
	private Node<Item> tail;
	private int size;
	
	public DoubleLinkedList() {
		this.head = this.tail = null;
		this.size = 0;
	}
	
	public void addToFront(Item data) {
		Node<Item> newNode = new Node(data);
		
		if(this.head == null) {
			this.head = this.tail = newNode;
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
			this.head = this.tail = newNode;
		}
		else {
			this.tail.next = newNode;
			newNode.prev = this.tail;
			this.tail = newNode;
		}
		this.size++;
	}
	
	public void removeFromFront() {
		if(this.head == null) {
			throw new IndexOutOfBoundsException("The list is empty!");
		}else if(this.head == this.tail) {
			this.head = this.tail = null;
		}else {
			this.head = this.head.next; 
			this.head.prev = null;
		}
		this.size--;
	}
	
	public void removeFromRear() {
		if(this.head == null) {
			throw new IndexOutOfBoundsException("The list is empty!");
		}else if(this.head == this.tail) {
			this.head = this.tail = null;
		}else {
			this.tail = this.tail.prev;
			this.tail.next = null;
		}
		this.size--;
	}
	
	public int count() {
		return this.size;
	}
	
	public Iterator<Item> iterator() {
	    return new DoubleLinkedListIterator();
	}
	 
	private class DoubleLinkedListIterator implements Iterator<Item> {        
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
