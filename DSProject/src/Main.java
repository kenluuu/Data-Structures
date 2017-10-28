
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable hashtable = new Hashtable();
		Student s1 = new Student("Ken", "15-123", 3.4);
		Student s2 = new Student("Oliver", "15-223", 2.7);
		Student s3 = new Student("Edward", "15-243", 4.0);
		Student s4 = new Student("Ken1", "15-213", 3.5);
		
		int s1Key = hashtable.toHashCode(s1.getRoll_no());
		int s2Key = hashtable.toHashCode(s2.getRoll_no());
		int s3Key = hashtable.toHashCode(s3.getRoll_no());
		int s4Key = hashtable.toHashCode(s4.getRoll_no());
		
		hashtable.insert(s1Key, s1);
		hashtable.insert(s2Key, s2);
		hashtable.insert(s3Key, s3);
		hashtable.insert(s4Key, s4);
		
	
		
//		hashtable.showData();
		
		Student newS1 = hashtable.fetchStudent(s1.getRoll_no());
		if(newS1.getName().equals(s1.getName())) {
			System.out.println("Equal");
		}
		
		hashtable.deleteStudent(s2.getRoll_no());
		hashtable.showData();
		
	}

}
