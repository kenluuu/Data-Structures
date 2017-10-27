
public class IntStack {
	private int[] stack; 
	private int top;
	private int size;
	
	public IntStack() {
		this.top = -1;
		this.size = 50;
		this.stack = new int [50];
		
	}
	
	public IntStack(int size) {
		this.size = size;
		this.top = -1;
		this.stack = new int[this.size];
	}
	
	public boolean push(int input) {
		if(!isFull()) {
			top++;
			this.stack[top] = input;
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isFull() {
		return (this.top == this.size-1);
	}
	
	public int pop() {
		return stack[top--];
		
	}
	
	public boolean isEmpty() {
		return (this.top == -1);
	}
	
	public void printStack() {
		for(int i=this.stack.length-1; i>-1; i--) {
			System.out.println(this.stack[i]);
		}
	}
	
	
}
