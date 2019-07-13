package training;

class Calc  //this is class this can have two things the variables & the methods
{
	int num1;
	int num2;
	int result;
	public void perform()  //this is a method
	{
		result = num1 + num2;
	}
}
public class ObjectDemo {
	public static void main(String[] args)
	{
		Calc obj = new Calc(); //this is object which knows something & does something
		obj.num1 = 3;
		obj.num2 = 5;
		 obj.perform();
		 
		 System.out.println(obj.result);
	}
}
