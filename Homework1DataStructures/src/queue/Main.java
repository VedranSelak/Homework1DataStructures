package queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new Queue<String>();
		q.enqueue("veka");
		q.enqueue("ali");
		q.enqueue("bera");
		q.enqueue("ilma");
		
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.size());
	}

}
