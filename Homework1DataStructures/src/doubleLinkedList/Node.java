package doubleLinkedList;

public class Node<Item> {
	private Item data;
	private Node<Item> next;
	private Node<Item> prev;
	
	public Node(Item data){
		this.data = data;
		this.next = this.prev = null;
	}
}
