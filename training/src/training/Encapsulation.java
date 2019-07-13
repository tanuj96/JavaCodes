package training;
// Encapsulation -->  Binding data with methods (it is needed to keep data safe)
class Student
{
	private int rollno;
	private String name;
	public int getRollno() {
		System.out.println("User is accessing the value");
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("Value of roll no is Changed");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// getters & setters
}

public class Encapsulation {

	public static void main(String[] args)
	{
		Student obj = new Student();
		obj.setRollno(45);
		obj.setName("Tanuj");

		System.out.println(obj.getName() + " : " + obj.getRollno());

	}

}
