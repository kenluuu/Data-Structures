
public class intq {
	private int[] q;
	private int size;
	private int total;
	private int front;
	private int rear;
	
	
	public intq() {
		this.size = 50;
		total = 0;
		front = 0;
		rear = 0;
		q = new int [this.size];
	}
	
	public intq(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		q = new int [this.size];
	}
	
	public boolean enqueue(int item) {
		if (isFull()) {
			System.out.println("queue is full");
			return false;
		} else {
			total++;
			q[rear] = item;
			rear = (rear + 1) % size;
			return true;
		}
	}
	
	public boolean isFull() {
		return (total == size);
	}
	
	
	public int dequeue() {
		int item = q[front];
		total--;
		front = (front + 1) % size;
		System.out.println(item);
		return item;
	}
	
	public void printQueue() {
		for(int i=0; i<q.length; i++) {
			System.out.println(q[i]);
		}
	}
	

	
}
