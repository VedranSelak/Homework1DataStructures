package queue;

public class Node<Item> {
	Node<Item> next;
	Item data;
	public Node(Item data) {
		this.next = null;
		this.data = data;
	}
}
