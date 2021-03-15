package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new Queue<String>();
		q.enqueue("John");
		q.enqueue("Doe");
		q.enqueue("David");
		q.enqueue("Bart");
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.size());
	}

}
