
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst = new BST();
		Person p1 = new Person("Ken", 24);
		Person p2 = new Person("Oliver", 55);
		Person p3 = new Person("Edward", 25);
		Person p4 = new Person("John", 32);
		Person p5 = new Person("Daddy", 45);
		Person p6 = new Person("Cena", 15);
		
		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		bst.insert(p5);
		bst.insert(p6);
	
		System.out.println();
		System.out.println(bst.getData(bst.findParent("John")).toString());
		System.out.println(bst.getData(bst.findParent("Oliver")).toString());
		System.out.println(bst.getData(bst.findParent("Cena")).toString());
		System.out.println(bst.getData(bst.findParent("Edward")).toString());
		System.out.println(bst.getData(bst.findParent("Ken")).toString());
	}	
	

}
