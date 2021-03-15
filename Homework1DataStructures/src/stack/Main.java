package stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<String>();
		s.push("John");
		s.push("Doe");
		s.push("Terry");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println(s.size());
	}
}
