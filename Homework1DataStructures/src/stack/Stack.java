package stack;

public class Stack<Item> {
	
	private int size;
	private Item[] stack;
	
	//initialize the stack
	@SuppressWarnings("unchecked")
	public Stack() {
		this.stack = (Item[]) new Object[1];
		this.size = 0;
	}
	
	//pushing to the stack
	public void push(Item data) {
		//if stack size == number of elements in stack double the stack size
		if(this.stack.length == this.size) {
			resize(2*this.stack.length);
		}
		//push element to the stack
		this.stack[this.size] = data;
		//increment the number of elements in the stack
		this.size++;
	}
	
	//pop from the stack
	public Item pop() {
		//if empty throw exception
		if(isEmpty()) {
			throw new IndexOutOfBoundsException("The stack is empty!");
		} else {
			//get the last element of the stack, the last is the latest addition
			Item data = this.stack[this.size-1];
			//decrement the number of elements in the stack
			this.size--;
			//if the stack size/4 == the number of elements in the stack, cut the stack size in half
			if(this.size == this.stack.length/4 && this.size > 0) {
				this.resize(this.stack.length/2);
			}
			return data;
		}
	}
	
	//resizing the stack
	@SuppressWarnings("unchecked")
	public void resize(int size) {
		//making a array to which we will copy our stack
		Item[] copy = (Item[]) new Object[size];
		//copying the stack to the new stack
		for(int i=0; i<this.size; i++) {
			copy[i] = this.stack[i];
		}
		//making the new stack our main stack
		this.stack = copy;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public int size() {
		return this.size;
	}
}
