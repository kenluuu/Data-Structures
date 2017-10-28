
public class IntLinkedList {
	private Node head;
	public IntLinkedList() {
		head = new Node();
		head.link = null;
		head.value = 0;
	}
	
	public int getHead() {
		System.out.println("Head value: " + head.value);
		return head.value;
	}
	
	public boolean insertItem(int item) {
		Node x = new Node();
		Node newNode = head;
		while(newNode.link != null) {
			newNode = newNode.link;
		}
		x.value = item;
		x.link = null;
		newNode.link = x;
		return true;
	}
	public void printList() {
		Node x = head.link;
		
		while(x.link != null) {
			System.out.println(x.value);
			x = x.link;	
		}
		System.out.println(x.value);
	}
	
	public boolean deleteItem(int item) {
		if (head.link.value == item) {
			head.link = head.link.link;
			return true;
		}
		Node x = head.link;
		Node y = x.link;
		while(true) {
			if (y == null || y.value == item) {
				break;
			} else {
				x = y;
				y = x.link;
			}
		}
		
		if (y == null) {
			return false;
		} else {
			x.link = y.link;
			
			return true;
		}
	}
	

	class Node {
		private int value;
		private Node link;
		
	}
	
	
}
