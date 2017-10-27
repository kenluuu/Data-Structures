
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStack intStack = new IntStack(5);
		if (intStack.isEmpty()) {
			intStack.push(1);
			intStack.push(21);
			intStack.push(123);
			intStack.push(199);
		}
		

		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
	}

}
