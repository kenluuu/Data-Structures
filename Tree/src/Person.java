
public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	public String toString() {
		return "\n >> Name: " + name + ", Age: " + age;
	}
	
}
