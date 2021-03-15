package doublyLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<String> list = new DoublyLinkedList<String>();
		list.addToRear("Bart");
		list.addToRear("John");
		list.addToRear("Doe");
		list.addToRear("Beth");
		list.addToFront("Magnus");
		
		list.removeFromFront();
		list.removeFromRear();
		list.removeFromRear();
		list.removeFromFront();
		
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println(list.count());
	}

}
