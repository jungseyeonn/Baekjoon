package q10828;

public class StackExample {
	private int ar[];
	private int top;
	
	public StackExample(int size) {
		ar = new int[size];
		top = -1;
	}
	
	public void push(int x) {
		ar[++top] = x;
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println(top);
		} else {
			System.out.println(ar[top--]);
		}
	}
	
	public void size() {
		System.out.println(top+1);
	}
	
	public void empty() {
		if(top==-1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
	
	public void top() {
		if(top==-1) {
			System.out.println(top);
		} else {
			System.out.println(ar[top]);
		}
	}
}
