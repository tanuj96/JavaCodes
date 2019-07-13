package training;

class Outer
{
	int a;  // member variable
	
	public void show() // member method
	{
		int i = 1;
		System.out.println(i);
	}
	
	class Inner  // member class
	{
		public void display()
		{
			System.out.println("In Display");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) 
	{
		Outer obj = new Outer();
		//obj.show();

		Outer.Inner obj1 = obj.new Inner();
		obj1.display();
	}

}
