
public class StudentList {
	private Node head;
	public StudentList() {
		head = new Node();
		head.data = null;
		head.next = null;
	}
	
	public boolean insertStudent(Student student) {
		Node n = new Node();
		n.data = student;
		n.next = head.next;
		head.next = n;
		return true;
	}
	
	public boolean haveRollno(String rollno) {
		Node a = head.next;
		boolean have = false;
		while(a != null) {
			if (rollno.equals(a.data.getRoll_no())) {
				have = true;
			}
			a = a.next;
		}
		return have;
	}
	
	public Student fetchData(String rollno) {
		Student data = null;
		Node p = head.next;
		while(p != null) {
			if (rollno.equals(p.data.getRoll_no())) {
				data = p.data;
				break;
			}
			p = p.next;
		}
		return data;
	}
	
	public void deleteStudent(String rollno) {
		Node p = head;
		Node q = p.next;
		
		while(q != null && !(q.data.getRoll_no().equals(rollno))) {
			p = q;
			q = p.next;
		}
		if (q != null) {
			p.next = q.next;
		} else {
			System.out.println("Student not found");
		}
	}
	
	public void showAll() {
		Node x = head.next;
		while(x != null) {
			System.out.println(x.data);
			x = x.next;
		}
	}
	
	class Node {
		private Student data;
		private Node next;
	}
}
