package doubleLinkedList;

public class Node<Item> {
	Item data;
	Node<Item> next;
	Node<Item> prev;
	
	public Node(Item data){
		this.data = data;
		this.next = this.prev = null;
	}
}
