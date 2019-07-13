package training;

class Emp
{
	int eid;
	int salary;
	static String CEO; //by use of static variables it will not be for a particular object now this variable will be same for all the objects
	
	public void show()
	{
		System.out.println(eid + " : " + salary + " : " + CEO);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		Emp navin = new Emp();
		navin.eid = 8;
		navin.salary = 5000;
		
		Emp vivek = new Emp();
		vivek.eid = 7;
		vivek.salary = 4000;
		
	    Emp.CEO = "Tanuj";
		navin.show();
		vivek.show();
	}

}
