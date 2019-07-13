package training;

interface Now
{	
	int num=8;  // whenever a variable is defined in interface it is by default final
	void abs();
	static void show()  // (In new 1.8 version of java) with static method in interface we can directly call method of interface without making its object
	{
		System.out.println("Hi");
	}
}

class Xyz implements Now
{
	public void abs()
	{
	 //num = 9;  this will show error because interface variables are by default constants
	}
}
public class StaticMethodinInterface {

	public static void main(String[] args) {
		Now.show();
		}

}
