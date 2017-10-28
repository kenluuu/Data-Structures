
public class Student {
	private String name;
	private String roll_no;
	private double cgpa;
	
	public Student(String name, String roll_no, double cpa) {
		this.name = name;
		this.roll_no = roll_no;
		this.cgpa = cpa;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public double getCgpa() {
		return cgpa;
	}
	
	public String toString() {
		return "Name: " + name + " Roll no: " + roll_no + " CGPA: " + cgpa;
	}
	
	
}
