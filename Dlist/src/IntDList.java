
public class IntDList {
	private Node head;
	public IntDList(int item) {
		head = new Node();
		head.prev = null;
		head.value = item;
		head.next = null;
	}
	
	public int getHead() {
		System.out.println("Head value: " + head.value);
		return head.value;
	}
	
	public boolean frontInsert(int item) {
		Node newNode = new Node();
		newNode.value = item;
		newNode.prev = null;
		newNode.next = head;
		head.prev = newNode;
		
		head = newNode;
		return true;
	}
	
	public boolean rearInsert(int item) {
		Node n = new Node();
		n.value = item;
		n.next = null;
		Node newNode = head;
		while(newNode.next != null) {
			newNode = newNode.next;
		}
		newNode.next = n;
		newNode = n;	
		newNode.prev = n;
		return true;
	}
	public void printList() {
		Node x = head.next;
		
		while(x != null) {
			System.out.println(x.value);
			x = x.next;	
		}
		
	}
	
	public boolean deleteItem(int item) {
		if (head.next.value == item) {
			head.next = head.next.next;
			return true;
		}
		Node x = head.next;
		Node y = x.next;
		while(true) {
			if (y == null || y.value == item) {
				break;
			} else {
				x = y;
				y = x.next;
			}
		}
		
		if (y == null) {
			return false;
		} else {
			x.next = y.next;
			
			return true;
		}
	}
	

	class Node {
		private int value;
		private Node next;
		private Node prev;
		
	}
}
