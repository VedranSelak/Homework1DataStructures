package doubleLinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleLinkedList<String> list = new DoubleLinkedList<String>();
		list.addToRear("veka");
		list.addToRear("sara");
		list.addToRear("naim");
		list.addToRear("elda");
		list.addToFront("ilma");
		
		list.removeFromFront();
		list.removeFromRear();
		list.removeFromFront();
		list.removeFromFront();
		list.removeFromFront();
	
		
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println(list.count());
	}

}
