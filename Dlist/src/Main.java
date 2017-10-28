
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntDList dlist = new IntDList(1);
		dlist.frontInsert(2);
		dlist.frontInsert(5);
		dlist.frontInsert(51);
		dlist.frontInsert(15);
		
		
		
		dlist.rearInsert(100);
		dlist.rearInsert(101);
		dlist.rearInsert(102);
		
		
		dlist.printList();
		
	}

}
