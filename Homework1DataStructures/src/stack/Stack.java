package stack;

public class Stack<Item> {
	
	private int size;
	private Item[] stack;
	
	@SuppressWarnings("unchecked")
	public Stack() {
		this.stack = (Item[]) new Object[1];
		this.size = 0;
	}
	
	public void push(Item data) {
		if(this.stack.length == this.size) {
			resize(2*this.stack.length);
		}
		this.stack[this.size] = data;
		this.size++;
	}
	
	public Item pop() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("The stack is empty!");
		} else {
			Item data = this.stack[this.size-1];
			this.size--;
			if(this.size == this.stack.length/4 && this.size > 0) {
				this.resize(this.stack.length/2);
			}
			return data;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void resize(int size) {
		Item[] copy = (Item[]) new Object[size];
		for(int i=0; i<this.size; i++) {
			copy[i] = this.stack[i];
		}
		this.stack = copy;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public int size() {
		return this.size;
	}
}
